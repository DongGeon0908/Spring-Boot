package com.hs.nlp.Controller;


import com.hs.nlp.Service.AnswerService;
import com.hs.nlp.Service.QuestionService;
import com.hs.nlp.model.Answer;
import com.hs.nlp.model.Question;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.Iterator;

@RestController
public class UploadController {
    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    @PostMapping("/insertUploadFile")
    public String insertUploadFile(MultipartHttpServletRequest request) throws Exception {
        try {
            // 파일 읽어들이기
            MultipartFile file = null;
            Iterator<String> mIterator = request.getFileNames();
            if(mIterator.hasNext()) {
                file = request.getFile(mIterator.next());
            }
            // 엑셀파일 열기 (엑셀버전 2007 이상일때, 오픈방법)
            OPCPackage opcPackage = OPCPackage.open(file.getInputStream());
            XSSFWorkbook wb = new XSSFWorkbook(opcPackage);
            // Sheet 수
            int sheetNum = wb.getNumberOfSheets();
            // Sheet 수만큼 Loop
            for(int num = 0; num<sheetNum; num++) {
                XSSFSheet sheet = wb.getSheetAt(num);
                Iterator<Row> iterator = sheet.iterator();
                // Row
                int r_num = -1;
                while(iterator.hasNext()) {
                    Row currentRow = iterator.next();
                    Iterator<Cell> cellIterator = currentRow.iterator();
                    System.out.println("********************새로운 행 시작********************");
                    // Cell 추출하기
                    int c_num = -1;
                    r_num ++;
                    int st_num = 0;
                    while(cellIterator.hasNext()) {
                        c_num ++;
                        if(r_num==0 && c_num<1) cellIterator.next();
                        else if(r_num==0 && c_num>=1){
                            Cell currentCell = cellIterator.next();
                            Question question = Question.builder()
                                    .content(currentCell.getStringCellValue())
                                    .questNum(c_num)
                                    .build();
                            questionService.SaveQ(question);
                        } else {

                            if(r_num>=1){
                                Cell currentCell = cellIterator.next();

                                // 학번 셀이라면
                                if(c_num==0){
                                    st_num = (int)currentCell.getNumericCellValue();
                                } else{
                                    String d;
                                    if(currentCell.getCellTypeEnum() == CellType.NUMERIC){
                                        d = Double.toString(currentCell.getNumericCellValue());
                                    } else {
                                        d = currentCell.getStringCellValue();
                                    }
                                    Answer answer = Answer.builder()
                                            .std_num(st_num)
                                            .content(d)
                                            .build();
                                    answerService.SaveA(answer, c_num);
                                }
                            }
                            System.out.println();
                        }

                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}

package com.hs.nlp.Controller;

import com.hs.nlp.Api.CosApi;
import com.hs.nlp.Api.JaccardApi;
import com.hs.nlp.Api.LevenApi;
import com.hs.nlp.Service.AnswerService;
import com.hs.nlp.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@Controller
public class NLPController {

    // 객체 담을 배열
    public static double[][] result = new double[75][6];

    // 전체 결과값의 합
    public static double[] sumResult = new double[5];

    @Autowired
    AnswerService answerService;

    @GetMapping({"/", ""})
    public String hello() {
        return "index";
    }

    @GetMapping("/table")
    public String table(Model model) {

        List<Answer> tmp = answerService.tableData();

        LevenApi levenApi = new LevenApi();
        CosApi cosApi = new CosApi();
        JaccardApi jaccardApi = new JaccardApi();

        String[][] data = new String[5][6];
        //double[][] result = new double[75][6]; // 총 계산은 450 곱하기 2

        int h = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = tmp.get(h++).getContent();
            }
        }


        // Leven 계산 - 0기준
        int a = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = levenApi.Lev(data[0][j], data[a][j]);
                sumResult[0] += result[i][j];
            }
            a++;
        }

        // Leven 계산 - 1기준
        a = 0;
        for (int i = 5; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = levenApi.Lev(data[1][j], data[a][j]);
                sumResult[1] += result[i][j];
            }
            a++;
        }

        // Leven 계산 - 2기준
        a = 0;
        for (int i = 10; i < 15; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = levenApi.Lev(data[2][j], data[a][j]);
                sumResult[2] += result[i][j];
            }
            a++;
        }

        // Leven 계산 - 3기준
        a = 0;
        for (int i = 15; i < 20; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = levenApi.Lev(data[3][j], data[a][j]);
                sumResult[3] += result[i][j];
            }
            a++;
        }

        // Leven 계산 - 4기준
        a = 0;
        for (int i = 20; i < 25; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = levenApi.Lev(data[4][j], data[a][j]);
                sumResult[4] += result[i][j];
            }
            a++;
        }

        // Cos 계산 - 0기준
        a = 0;
        for (int i = 25; i < 30; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = cosApi.Cos(data[0][j], data[a][j]);
                sumResult[0] += result[i][j];
            }
            a++;
        }

        // Cos 계산 - 1기준
        a = 0;
        for (int i = 30; i < 35; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = cosApi.Cos(data[1][j], data[a][j]);
                sumResult[1] += result[i][j];
            }
            a++;
        }

        // Cos 계산 - 2기준
        a = 0;
        for (int i = 35; i < 40; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = cosApi.Cos(data[2][j], data[a][j]);
                sumResult[2] += result[i][j];
            }
            a++;
        }

        // Cos 계산 - 3기준
        a = 0;
        for (int i = 40; i < 45; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = cosApi.Cos(data[3][j], data[a][j]);
                sumResult[3] += result[i][j];
            }
            a++;
        }

        // Cos 계산 - 4기준
        a = 0;
        for (int i = 45; i < 50; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = cosApi.Cos(data[4][j], data[a][j]);
                sumResult[4] += result[i][j];
            }
            a++;
        }

        // jaccardApi - 0기준
        a = 0;
        for (int i = 50; i < 55; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = jaccardApi.solution(data[0][j], data[a][j]);
                sumResult[0] += result[i][j];
            }
            a++;
        }

        // jaccardApi - 1기준
        a = 0;
        for (int i = 55; i < 60; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = jaccardApi.solution(data[1][j], data[a][j]);
                sumResult[1] += result[i][j];
            }
            a++;
        }

        // jaccardApi - 2기준
        a = 0;
        for (int i = 60; i < 65; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = jaccardApi.solution(data[2][j], data[a][j]);
                sumResult[2] += result[i][j];
            }
            a++;
        }

        // jaccardApi - 3기준
        a = 0;
        for (int i = 65; i < 70; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = jaccardApi.solution(data[3][j], data[a][j]);
                sumResult[3] += result[i][j];
            }
            a++;
        }

        // jaccardApi - 4기준
        a = 0;
        for (int i = 70; i < 75; i++) {
            for (int j = 0; j < 6; j++) {
                result[i][j] = jaccardApi.solution(data[4][j], data[a][j]);
                sumResult[4] += result[i][j];
            }
            a++;
        }

        System.out.println("---------    Hanshin NLP DATA     ------------");

        for (int i = 0; i < 75; i++) {
            if (i % 5 == 0) {
                if (i >= 0 && i < 5) {
                    System.out.println("-------------------------------------   Lev 1 st");
                } else if (i >= 5 && i < 10) {
                    System.out.println("-------------------------------------   Lev 2 st");
                } else if (i >= 10 && i < 15) {
                    System.out.println("-------------------------------------   Lev 3 st");
                } else if (i >= 15 && i < 20) {
                    System.out.println("-------------------------------------   Lev 4 st");
                } else if (i >= 20 && i < 25) {
                    System.out.println("-------------------------------------   Lev 5 st");
                } else if (i >= 25 && i < 30) {
                    System.out.println("-------------------------------------   Cos 1 st");
                } else if (i >= 30 && i < 35) {
                    System.out.println("-------------------------------------   Cos 2 st");
                } else if (i >= 35 && i < 40) {
                    System.out.println("-------------------------------------   Cos 3 st");
                } else if (i >= 40 && i < 45) {
                    System.out.println("-------------------------------------   Cos 4 st");
                } else if (i >= 45 && i < 50) {
                    System.out.println("-------------------------------------   Cos 5 st");
                } else if (i >= 50 && i < 55) {
                    System.out.println("-------------------------------------   Jaccad 1 st");
                } else if (i >= 55 && i < 60) {
                    System.out.println("-------------------------------------   Jaccad 2 st");
                } else if (i >= 60 && i < 65) {
                    System.out.println("-------------------------------------   Jaccad 3 st");
                } else if (i >= 65 && i < 70) {
                    System.out.println("-------------------------------------   Jaccad 4 st");
                } else if (i >= 70 && i < 75) {
                    System.out.println("-------------------------------------   Jaccad 5 st");
                }
            }

            for (int j = 0; j < 6; j++) {
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");

        model.addAttribute("datas", result);

        return "table";
    }

    @GetMapping("/graph")
    public String graph(Model model) {

        model.addAttribute("datas", result);
        return "graph";
    }

    @GetMapping("/qa")
    public String qa(){
        return "qa";
    }


    @GetMapping("/result")
    public String result(Model model) {

        String[] str = {"김동건", "강동진", "황인준", "성민수", "한유림"};
        List<Student> stu = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            stu.add(new Student(str[i], sumResult[i] - 15));
        }

        Collections.sort(stu);

        String[] rresult = new String[5];

        System.out.println("심혈을 기울여서 만든 역작");
        int ppp = 0;
        for (Student i : stu) {
            String nname = i.getName();
            double rrresult = i.getScore();

            rresult[ppp++] = nname;
            System.out.println("name : " + nname + "  /  " + "result : " + rrresult);
        }


        model.addAttribute("datas", rresult);
        return "result";
    }
}

class Student implements Comparable<Student> {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return this.score;
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub

        if (this.score > o.score) {
            return -1;
        } else if (this.score < o.score) {
            return 1;
        } else {
            return 0;
        }

    }

}

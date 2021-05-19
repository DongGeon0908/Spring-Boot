package com.hs.nlp.Service;



import com.hs.nlp.model.Answer;
import com.hs.nlp.model.Question;
import com.hs.nlp.repository.AnswerRepository;
import com.hs.nlp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;
    @Autowired
    private QuestionRepository questionRepository;

    @Transactional(readOnly = true)
    public List<Answer> tableData() {

        return answerRepository.findAll();
    }

    @Transactional(readOnly = false)
    public void SaveA(Answer answer, int quest_num) {
        Question q = questionRepository.findQuestionByQuestNum(quest_num).orElseGet(()->{
            return new Question();
        });
        answer.setQuestion(q);
        answerRepository.save(answer);
    }


}

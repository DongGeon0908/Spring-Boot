package com.hs.nlp.Service;


import com.hs.nlp.model.Question;
import com.hs.nlp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    @Transactional(readOnly = false)
    public void SaveQ(Question question) {
        questionRepository.save(question);
    }
}

package com.hs.nlp.repository;


import com.hs.nlp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Optional<Question> findQuestionByQuestNum(int quest_num);
}

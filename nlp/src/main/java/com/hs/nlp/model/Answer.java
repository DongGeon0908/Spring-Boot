package com.hs.nlp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
    private int id;

    @Column()
    private int std_num;

    @Lob
    private String content;

    @ManyToOne(targetEntity = Question.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "quest_num")
    private Question question;
}
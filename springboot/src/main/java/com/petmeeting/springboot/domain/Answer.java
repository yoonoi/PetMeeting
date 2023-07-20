package com.petmeeting.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Answer {

    @Id
    @GeneratedValue
    @Column(name = "answer_no")
    private Integer answerNo;

    // 얘 추가했는데 맞나요?
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inquiry_no")
    private Inquiry inquiry;


    @Column(name = "content", columnDefinition = "text", nullable = false)
    private String content;


}

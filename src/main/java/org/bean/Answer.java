package org.bean;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Answer  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ansId;

    public Answer() {
    }

    @Column(length = 64000)
    private String ansText;

    @Temporal(TemporalType.DATE)
    private Calendar ansTimeStamp;

    @OneToOne
    private User user;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    private Question question;

    public Integer getAnsId() {
        return ansId;
    }

    public void setAnsId(Integer ansId) {
        this.ansId = ansId;
    }

    public String getAnsText() {
        return ansText;
    }

    public void setAnsText(String ansText) {
        this.ansText = ansText;
    }

    public Calendar getAnsTimeStamp() {
        return ansTimeStamp;
    }

    public void setAnsTimeStamp(Calendar ansTimeStamp) {
        this.ansTimeStamp = ansTimeStamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}

package com.anketAS.MVI.Entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="HappinessSurvey")
public class HappinessSurvey {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="sur_name")
    private String surname;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "birthday", columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private java.sql.Date birthday;
    @Column(name="happiness_rate")
   private int happinessRate;
    @Column(name="making_happy")
   private String makingHappy;
    @Column(name="making_Unhappy")
   private String makingUnHappy;
    @Column(name="surveyor_name",length=25)
    private String surveyorName;
    @Column(name="surveyor_sur_name",length=25)
    private String SurveyorSurName;

    public String getSurveyorName() {
        return surveyorName;
    }

    public void setSurveyorName(String surveyorName) {
        this.surveyorName = surveyorName;
    }

    public String getSurveyorSurName() {
        return SurveyorSurName;
    }

    public void setSurveyorSurName(String surveyorSurName) {
        SurveyorSurName = surveyorSurName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getHappinessRate() {
        return happinessRate;
    }
    public void setHappinessRate(int happinessRate) {
        this.happinessRate = happinessRate;
    }
    public String getMakingHappy() {
        return makingHappy;
    }
    public void setMakingHappy(String makingHappy) {
        this.makingHappy = makingHappy;
    }
    public String getMakingUnHappy() {
        return makingUnHappy;
    }
    public void setMakingUnHappy(String makingUnHappy) {
        this.makingUnHappy = makingUnHappy;
    }
}

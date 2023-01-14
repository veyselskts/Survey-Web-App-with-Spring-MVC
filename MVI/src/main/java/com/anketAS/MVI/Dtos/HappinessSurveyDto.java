package com.anketAS.MVI.Dtos;

import com.anketAS.MVI.Entities.Gender;

import java.sql.Date;

public class HappinessSurveyDto {
    private long id;
    private String name;
    private String surname;
    private Gender gender;
    private java.sql.Date birthday;
    private int happinessRate;
    private String makingHappy;
    private String makingUnHappy;
    private String surveyorName;
    private String surveyorSurName;


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

    public String getSurveyorName() {
        return surveyorName;
    }

    public void setSurveyorName(String surveyorName) {
        this.surveyorName = surveyorName;
    }

    public String getSurveyorSurName() {
        return surveyorSurName;
    }

    public void setSurveyorSurName(String surveyorSurName) {
        this.surveyorSurName = surveyorSurName;
    }
}

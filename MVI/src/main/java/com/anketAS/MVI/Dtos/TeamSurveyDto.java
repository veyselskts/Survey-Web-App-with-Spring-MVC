package com.anketAS.MVI.Dtos;

import com.anketAS.MVI.Entities.Gender;

import java.sql.Date;

public class TeamSurveyDto {
    private long id;
    private String name;
    private String surname;
    private Gender gender;
    private java.sql.Date birthday;
    private String team;
    private String description;
    private String surveyorName;
    private String surveyorSurName;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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
        this.gender = this.gender;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

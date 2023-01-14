package com.anketAS.MVI.Entities;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name="TeamSurvey")
public class TeamSurvey {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="sur_name")
    private String surName;
    @Enumerated(EnumType.STRING)
    @Column(name="gender")
    private Gender gender;
    /*@DateTimeFormat(pattern = "dd.MM.yyyy")
    @Column(name="birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;

     */
    @Column(name = "birthday", columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private java.sql.Date birthday;
    @Column(name="team",length=25)
    private String team;
    @Column(name="team_description",length=50)
    private String description;
    @Column(name="surveyor_name",length=25)
    private String surveyorName;
    @Column(name="surveyor_sur_name",length=25)
    private String surveyorSurName;

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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
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


}

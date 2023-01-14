package com.anketAS.MVI.Service;

import com.anketAS.MVI.Dtos.TeamSurveyDto;
import com.anketAS.MVI.Entities.TeamSurvey;
import org.springframework.ui.Model;

import java.util.List;

public interface ITeamSurveyService {
    void create(TeamSurveyDto teamSurveyDto);
    void update(TeamSurveyDto teamSurveyDto, long id);
    void delete(long id);
     List<TeamSurveyDto> findAll();



    TeamSurvey getTeamSurveyById(long id);
}

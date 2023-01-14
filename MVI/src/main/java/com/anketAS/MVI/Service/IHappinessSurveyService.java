package com.anketAS.MVI.Service;

import com.anketAS.MVI.Dtos.HappinessSurveyDto;
import com.anketAS.MVI.Entities.HappinessSurvey;

import java.util.List;

public interface IHappinessSurveyService {
    void create(HappinessSurveyDto happinessSurveyDto);
    void update(HappinessSurveyDto happinessSurveyDto, long id);
    void delete(long id);
    public List<HappinessSurveyDto> findAll();

}

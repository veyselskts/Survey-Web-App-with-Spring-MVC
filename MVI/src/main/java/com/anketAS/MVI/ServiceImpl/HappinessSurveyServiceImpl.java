package com.anketAS.MVI.ServiceImpl;

import com.anketAS.MVI.Dtos.HappinessSurveyDto;
import com.anketAS.MVI.Dtos.TeamSurveyDto;
import com.anketAS.MVI.Entities.Gender;
import com.anketAS.MVI.Entities.HappinessSurvey;
import com.anketAS.MVI.Entities.TeamSurvey;
import com.anketAS.MVI.Repository.IHappinessSurveyRepo;
import com.anketAS.MVI.Service.IHappinessSurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HappinessSurveyServiceImpl implements IHappinessSurveyService {
    IHappinessSurveyRepo _happinessSurveyRepo;
    @Autowired
    public HappinessSurveyServiceImpl(IHappinessSurveyRepo happinessSurveyRepo){
        this._happinessSurveyRepo=happinessSurveyRepo;
    }
    @Override
    public void create(HappinessSurveyDto happinessSurveyDto) {
        HappinessSurvey happinessSurvey=new HappinessSurvey();
        happinessSurvey.setName(happinessSurveyDto.getName());
        happinessSurvey.setSurname(happinessSurveyDto.getSurname());
        happinessSurvey.setGender(happinessSurveyDto.getGender());
        happinessSurvey.setBirthday(happinessSurveyDto.getBirthday());
        happinessSurvey.setHappinessRate(happinessSurveyDto.getHappinessRate());
        happinessSurvey.setMakingHappy(happinessSurveyDto.getMakingHappy());
        happinessSurvey.setMakingUnHappy(happinessSurveyDto.getMakingUnHappy());
        happinessSurvey.setSurveyorName(happinessSurveyDto.getSurveyorName());
        happinessSurvey.setSurveyorSurName(happinessSurveyDto.getSurveyorSurName());
        _happinessSurveyRepo.save(happinessSurvey);
    }

    @Override
    public void update(HappinessSurveyDto happinessSurveyDto, long id) {
        HappinessSurvey happinessSurvey=_happinessSurveyRepo.findById(id).get();
        happinessSurvey.setName(happinessSurveyDto.getName());
        happinessSurvey.setSurname(happinessSurveyDto.getSurname());
        happinessSurvey.setGender(happinessSurveyDto.getGender());
        happinessSurvey.setBirthday(happinessSurveyDto.getBirthday());
        happinessSurvey.setHappinessRate(happinessSurveyDto.getHappinessRate());
        happinessSurvey.setMakingHappy(happinessSurveyDto.getMakingHappy());
        happinessSurvey.setMakingUnHappy(happinessSurveyDto.getMakingUnHappy());
        _happinessSurveyRepo.save(happinessSurvey);

    }

    @Override
    public void delete(long id) {_happinessSurveyRepo.deleteById(id);
    }

    @Override
    public List<HappinessSurveyDto> findAll() {
        List<HappinessSurvey> happinessSurveys =_happinessSurveyRepo.findAll();
        return happinessSurveys.stream()
                .map((happinessSurvey) -> mapToHappinessSurveyDto(happinessSurvey))
                .collect(Collectors.toList());
    }
    private HappinessSurveyDto mapToHappinessSurveyDto(HappinessSurvey happinessSurvey) {
        HappinessSurveyDto happinessSurveyDto = new HappinessSurveyDto();
        String[] str = happinessSurvey.getName().split(" ");
        happinessSurveyDto.setName(str[0]);
        happinessSurveyDto.setSurname(str[1]);
        happinessSurveyDto.setBirthday(Date.valueOf(str[2]));
        happinessSurveyDto.setGender(Gender.valueOf(str[3]));
        happinessSurveyDto.setHappinessRate(happinessSurvey.getHappinessRate());
        happinessSurveyDto.setMakingHappy(str[5]);
        happinessSurveyDto.setMakingUnHappy(str[6]);
        happinessSurveyDto.setSurveyorName(str[7]);
        happinessSurveyDto.setSurveyorSurName(str[8]);
        return happinessSurveyDto;
    }
}

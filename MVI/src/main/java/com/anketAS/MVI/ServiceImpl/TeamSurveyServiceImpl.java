package com.anketAS.MVI.ServiceImpl;

import com.anketAS.MVI.Dtos.TeamSurveyDto;
import com.anketAS.MVI.Entities.Gender;
import com.anketAS.MVI.Entities.TeamSurvey;
import com.anketAS.MVI.Repository.ITeamSurveyRepo;
import com.anketAS.MVI.Service.ITeamSurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TeamSurveyServiceImpl implements ITeamSurveyService {

    private ITeamSurveyRepo _teamSurveyRepo;

    @Autowired
    public TeamSurveyServiceImpl(ITeamSurveyRepo teamSurveyRepo) {
        this._teamSurveyRepo = teamSurveyRepo;
    }

    @Override
    public void create(TeamSurveyDto teamSurveyDto) {
        TeamSurvey teamSurvey = new TeamSurvey();
        teamSurvey.setName(teamSurveyDto.getName());
        teamSurvey.setSurName(teamSurveyDto.getSurname());
        teamSurvey.setGender(teamSurveyDto.getGender());
        teamSurvey.setBirthday(teamSurveyDto.getBirthday());
        teamSurvey.setTeam(teamSurveyDto.getTeam());
        teamSurvey.setDescription(teamSurveyDto.getDescription());
        teamSurvey.setSurveyorName(teamSurveyDto.getSurveyorName());
        teamSurvey.setSurveyorSurName(teamSurveyDto.getSurveyorSurName());
        _teamSurveyRepo.save(teamSurvey);
    }

    @Override
    public void update(TeamSurveyDto teamSurveyDto, long id) {
        TeamSurvey teamSurvey = _teamSurveyRepo.findById(id).get();
        teamSurvey.setName(teamSurveyDto.getName());
        teamSurvey.setSurName(teamSurveyDto.getSurname());
        teamSurvey.setGender(teamSurveyDto.getGender());
        teamSurvey.setBirthday(teamSurveyDto.getBirthday());
        teamSurvey.setTeam(teamSurveyDto.getTeam());
        teamSurvey.setDescription(teamSurveyDto.getDescription());

        _teamSurveyRepo.save(teamSurvey);
    }

    @Override
    public void delete(long id) {
        _teamSurveyRepo.deleteById(id);
    }

    @Override
    public List<TeamSurveyDto> findAll() {
        List<TeamSurvey> teamSurveys = _teamSurveyRepo.findAll();
        return teamSurveys.stream()
                .map(this::mapToTeamSurveyDto)
                .collect(Collectors.toList());
    }



    private TeamSurveyDto mapToTeamSurveyDto(TeamSurvey teamSurvey) {
        TeamSurveyDto teamSurveyDto = new TeamSurveyDto();
        String[] str = teamSurvey.getName().split(" ");
        teamSurveyDto.setName(str[0]);
        teamSurveyDto.setSurname(str[1]);
        teamSurveyDto.setBirthday(Date.valueOf(str[2]));
        teamSurveyDto.setGender(Gender.valueOf(str[3]));
        teamSurveyDto.setTeam(str[4]);
        teamSurveyDto.setDescription(str[5]);
        teamSurveyDto.setSurveyorName(str[6]);
        teamSurveyDto.setSurveyorSurName(str[7]);
        return teamSurveyDto;
    }

    @Override
    public TeamSurvey getTeamSurveyById(long id) {
        Optional<TeamSurvey> teamSurveys = _teamSurveyRepo.findById(id);
        TeamSurvey teamSurvey = null;
        if (teamSurveys.isPresent()) {
            teamSurvey = teamSurveys.get();
        } else {
            throw new RuntimeException("Bu id'ye ait bir anket bulunamadı.: " + id);
        }

        return teamSurvey;
    }
}
package com.anketAS.MVI.Controller;
import org.springframework.ui.Model;
import com.anketAS.MVI.Dtos.TeamSurveyDto;
import com.anketAS.MVI.Entities.TeamSurvey;
import com.anketAS.MVI.ServiceImpl.TeamSurveyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@RestController
@RequestMapping(value ="/TeamSurvey", consumes = MediaType.ALL_VALUE)
public class TeamSurveyController {
    private TeamSurveyServiceImpl teamSurveyServiceImpl;
    @Autowired
    public void TeamSurveyController(TeamSurveyServiceImpl _teamSurveyServiceImpl) {
    this.teamSurveyServiceImpl =_teamSurveyServiceImpl;    }

    @PostMapping("/create")
    public String create(@ModelAttribute("createTeamSurveyPage")  TeamSurveyDto teamSurveyDto){
        teamSurveyServiceImpl.create(teamSurveyDto);
        return "Anket Tamamlandı.";
    }

    @PostMapping("/update")
    public String update( @ModelAttribute("updateTeamSurveyPage.html") TeamSurveyDto teamSurveyDto,Long id){
        teamSurveyServiceImpl.update(teamSurveyDto,id);
        return "redirect:/homepage.html";
    }
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@ModelAttribute("deleteTeamSurveyPage.html") TeamSurveyDto teamSurveyDto, Long id){
        teamSurveyServiceImpl.delete(id);
        return "redirect:/homepage";
    }
    @GetMapping("/allTeamSurveyList")
    public String teamSurveys( Model model ) {
    List<TeamSurveyDto> teamSurveys=teamSurveyServiceImpl.findAll();
    model.addAttribute("teamSurveys",teamSurveys );
        return "teamSurveys";  }


}



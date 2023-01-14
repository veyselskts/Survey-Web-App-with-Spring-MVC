package com.anketAS.MVI.Controller;

import com.anketAS.MVI.Dtos.HappinessSurveyDto;
import com.anketAS.MVI.Dtos.TeamSurveyDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    @RequestMapping("/home")
    public String home() {
        return "homepage";
    }
    @GetMapping("/TeamSurveySolver")
    public String teamSurveySolver(@ModelAttribute TeamSurveyDto teamSurveyDto) {
        return "teamSurveySolver" ;   }
    @GetMapping("/CreateTeamSurvey")
    public String createTeamSurvey(@ModelAttribute TeamSurveyDto teamSurveyDto) {
        return "createTeamSurveyPage" ;   }
    @GetMapping("/UpdateTeamSurvey")
    public String updateTeamSurvey(@ModelAttribute TeamSurveyDto teamSurveyDto) {
        return "updateTeamSurveyPage" ;   }
    @GetMapping("/DeleteTeamSurvey")
    public String deleteTeamSurvey(@ModelAttribute TeamSurveyDto teamSurveyDto) {
        return "deleteTeamSurveyPage" ;   }
    @GetMapping("/HappinessSurveySolver")
    public String happinessSurveySolver(@ModelAttribute HappinessSurveyDto happinessSurveyDto) {
        return "happinessSurveySolver" ;   }

    @GetMapping("/CreateHappinessSurvey")
    public String createHappinessSurvey(@ModelAttribute HappinessSurveyDto happinessSurveyDto) {
        return "createHappinessSurveyPage" ;   }
    @GetMapping("/UpdateHappinessSurvey")
    public String updateHappinessSurvey(@ModelAttribute HappinessSurveyDto happinessSurveyDto) {
        return "updateHappinessSurveyPage" ;   }
    @GetMapping("/DeleteHappinessSurvey")
    public String deleteHappinessSurvey(@ModelAttribute HappinessSurveyDto happinessSurveyDto) {
        return "deleteHappinessSurveyPage" ;   }
    @GetMapping("/allTeamSurveyList")
    public String teamSurveySolver( Model model) {
        return "allTeamSurveyPage" ;   }
    @GetMapping("/allHappinessSurveyList")
    public String happinessSurveySolver( Model model) {
        return "allHappinessSurveyPage" ;   }
}

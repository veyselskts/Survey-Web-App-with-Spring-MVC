package com.anketAS.MVI.Controller;

import com.anketAS.MVI.Dtos.HappinessSurveyDto;
import com.anketAS.MVI.Dtos.TeamSurveyDto;
import com.anketAS.MVI.Entities.HappinessSurvey;
import com.anketAS.MVI.ServiceImpl.HappinessSurveyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/HappinessSurvey", consumes = MediaType.ALL_VALUE)
public class HappinessSurveyController {
    private HappinessSurveyServiceImpl happinessSurveyServiceImpl;
    @Autowired
    public void HappinessSurveyController(HappinessSurveyServiceImpl _happinessSurveyServiceImpl){
        this.happinessSurveyServiceImpl=_happinessSurveyServiceImpl;
    }
    @PostMapping("/create")
    public String create(@ModelAttribute("createHappinessSurveyPage")  HappinessSurveyDto happinessSurveyDto){
        happinessSurveyServiceImpl.create(happinessSurveyDto);
        return "Anket Tamamlandı.";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute("updateHappinessSurveyPage") HappinessSurveyDto happinessSurveyDto,long id){
        happinessSurveyServiceImpl.update(happinessSurveyDto,id);
        return "Güncelleme işlemi tamamlandı.";
    }
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@ModelAttribute("deleteHappinessSurveyPage.html") TeamSurveyDto teamSurveyDto, Long id){
        happinessSurveyServiceImpl.delete(id);
        return "Silme işlemi tamamlandı.";
    }
    @GetMapping("/allHappinessSurveyList")
    public String happinessSurveys(Model model) {
        List<HappinessSurveyDto> happinessSurveys=happinessSurveyServiceImpl.findAll();
        model.addAttribute("happinessSurveys", happinessSurveys);
        return "happinessSurveys";   }
}

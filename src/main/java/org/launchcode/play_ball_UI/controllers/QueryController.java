package org.launchcode.play_ball_UI.controllers;

import org.launchcode.play_ball_UI.models.GamePlayer;
import org.launchcode.play_ball_UI.models.Year;
import org.launchcode.play_ball_UI.models.dataAccessObjects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value= "/playball/query")
public class QueryController {
    @Autowired
    YearDataAccessObject daoYear;
    YearGameTypeDataAccessObject daoYearGameType;
    YearGameTypeGameDataAccessObject daoYearGameTypeGame;
    YearGameTypePlayerDataAccessObject daoYearGameTypePlayer;

    @GetMapping(value="")
    public String getPlayer(Model model){

        Iterable<Year> years = daoYear.getYearsData();

        model.addAttribute("years", years);

        return "query";
    }
}

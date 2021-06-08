package org.buss.controller;

import com.game.entity.Match;
import org.buss.service.RockPaperScissorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rps")
public class GameController {
    @Autowired
    private RockPaperScissorsService rpsService;

    @RequestMapping("/play")
    public String getResult() {
        return rpsService.playGame().toString();
    }

}

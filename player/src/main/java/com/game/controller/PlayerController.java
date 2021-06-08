package com.game.controller;

import com.game.api.PlayerAPI;
import com.game.service.GamerMoveService;
import com.game.utils.GameMoves;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gamer")
public class PlayerController implements PlayerAPI {
    @Autowired
    private GamerMoveService gamerMoveService;

    @Override
    @RequestMapping("/move")
    public GameMoves getGameMove() {
        return gamerMoveService.makeMove();
    }
}

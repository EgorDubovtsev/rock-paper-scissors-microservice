package com.game.service;

import com.game.api.PlayerAPI;
import com.game.utils.GameMoves;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GamerMoveService  {

    private GameMoves gameMoves[] = GameMoves.values();
    @Autowired
    private Random random;

    public GameMoves makeMove() {
        return gameMoves[random.nextInt(gameMoves.length)];
    }



}


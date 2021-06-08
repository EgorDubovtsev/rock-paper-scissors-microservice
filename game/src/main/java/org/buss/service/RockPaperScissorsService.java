package org.buss.service;

import com.game.api.PlayerAPI;
import com.game.entity.Match;
import com.game.utils.GameMoves;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RockPaperScissorsService implements GameService {
    @Autowired
    PlayerAPI playerAPI;

    @Override
    public Match playGame() {
        GameMoves firsItem = playerAPI.getGameMove();
        GameMoves secondItem = playerAPI.getGameMove();

        return getWinner(firsItem, secondItem);
    }

    private Match getWinner(GameMoves firstItem, GameMoves secondItem) {
        Match match = new Match();
        match.setFirstItem(firstItem);
        match.setSecondItem(secondItem);

        if (firstItem == secondItem) {
            match.setWinner(null);
        } else if (firstItem.getId() + secondItem.getId() == 2) {
            match.setWinner(firstItem.getId() == 2 ? firstItem : secondItem);
        } else {
            match.setWinner(firstItem.getId() < secondItem.getId() ? firstItem : secondItem);
        }

        return match;
    }
}

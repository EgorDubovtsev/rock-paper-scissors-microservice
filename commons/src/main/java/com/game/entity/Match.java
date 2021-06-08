package com.game.entity;

import com.game.utils.GameMoves;

public class Match {
    private GameMoves firstItem;
    private GameMoves secondItem;
    private GameMoves winner;

    public GameMoves getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(GameMoves firstItem) {
        this.firstItem = firstItem;
    }

    public GameMoves getSecondItem() {
        return secondItem;
    }

    public void setSecondItem(GameMoves secondItem) {
        this.secondItem = secondItem;
    }

    public GameMoves getWinner() {
        return winner;
    }

    public void setWinner(GameMoves winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "Match{" +
                "firstItem=" + firstItem +
                ", secondItem=" + secondItem +
                ", winner=" + winner +
                '}';
    }
}

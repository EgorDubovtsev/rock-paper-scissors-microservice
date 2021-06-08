package com.game.utils;

public enum GameMoves {
    ROCK(0), SCISSORS(1), PAPER(2);
    private int id;

    GameMoves(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

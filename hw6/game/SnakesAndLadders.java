package org.future.code.homework.hw6.game;

public class SnakesAndLadders implements TableGame {
    @Override
    public void start() {
        System.out.println("Начало игры.");
    }

    @Override
    public boolean end() {
        return true;
    }

    @Override
    public void rollDice() {
        System.out.println("*Бросок кубика*");
    }
}

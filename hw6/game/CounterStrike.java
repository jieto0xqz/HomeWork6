package org.future.code.homework.hw6.game;

public class CounterStrike implements ComputerGame {
    @Override
    public void shoot() {
        System.out.println("*Выстрел*");
    }

    @Override
    public void move() {
        System.out.println("*Движение*");
    }

    @Override
    public void start() {
        System.out.println("Начало игры.");
    }

    @Override
    public boolean end() {
        return true;
    }
}

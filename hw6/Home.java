package org.future.code.homework.hw6;

import org.future.code.homework.hw6.game.CounterStrike;
import org.future.code.homework.hw6.game.SnakesAndLadders;
import org.future.code.homework.hw6.instruments.Drum;
import org.future.code.homework.hw6.instruments.Guitar;
import org.future.code.homework.hw6.instruments.Trumpet;

public class Home {
    public static CounterStrike counterStrike = new CounterStrike();
    public static CounterStrike counterStrike2 = new CounterStrike();

    public static SnakesAndLadders snakesAndLadders = new SnakesAndLadders();
    public static SnakesAndLadders snakesAndLadders2 = new SnakesAndLadders();

    public static Guitar guitar = new Guitar();
    public static Guitar guitar2 = new Guitar();

    public static Drum drum = new Drum();
    public static Drum drum2 = new Drum();

    public static Trumpet trumpet = new Trumpet();
    public static Trumpet trumpet2 = new Trumpet();

    public static void main() {
        counterStrike.start();
        counterStrike.move();
        counterStrike.shoot();
        counterStrike.end();

        counterStrike2.start();
        counterStrike2.move();
        counterStrike2.shoot();
        counterStrike2.end();

        snakesAndLadders.start();
        snakesAndLadders.rollDice();
        snakesAndLadders.end();

        snakesAndLadders2.start();
        snakesAndLadders2.rollDice();
        snakesAndLadders2.end();

        guitar.play();
        guitar2.play();

        drum.play();
        drum2.play();

        trumpet.play();
        trumpet2.play();
    }
}

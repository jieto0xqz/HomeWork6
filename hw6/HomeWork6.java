package org.future.code.homework.hw6;

import org.future.code.homework.hw6.instruments.Drum;
import org.future.code.homework.hw6.instruments.Guitar;
import org.future.code.homework.hw6.instruments.Instrument;
import org.future.code.homework.hw6.instruments.Trumpet;

import java.util.Arrays;
import java.util.List;

public class HomeWork6 {
    public static void main(String[] args) {
        List<Instrument> instruments = Arrays.asList(new Guitar(), new Drum(), new Trumpet());
        for (Instrument instrument : instruments) {
            instrument.play();
        }

        Home.main();
    }
}

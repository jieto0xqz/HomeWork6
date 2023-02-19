package org.future.code.homework.hw6.instruments;

public class Trumpet extends Instrument {
    public int diameter = 20;
    @Override
    public void play() {
        System.out.println("Играет труба, с диаметром " + diameter);
    }
}

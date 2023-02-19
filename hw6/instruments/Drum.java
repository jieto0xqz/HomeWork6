package org.future.code.homework.hw6.instruments;

public class Drum extends Instrument {
    public int size = 1;
    @Override
    public void play() {
        System.out.println("Играет барабан, размером " + size);
    }
}

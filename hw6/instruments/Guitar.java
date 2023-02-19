package org.future.code.homework.hw6.instruments;

public class Guitar extends Instrument {
    public int guitarStrings = 6;
    @Override
    public void play() {
        System.out.println("Играет гитара, с " + guitarStrings + " струнами");
    }
}

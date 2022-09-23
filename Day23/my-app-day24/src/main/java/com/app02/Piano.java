package com.app02;

public class Piano  extends  MusicInstrument {

    @Override
    public void play() {
        System.out.println("Piano play");
    }

    public void printPrice(){
        System.out.println("Print price()");
    }
}

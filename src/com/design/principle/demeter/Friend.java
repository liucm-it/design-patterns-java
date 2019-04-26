package com.design.principle.demeter;

public class Friend {
    public void play() {
        System.out.println("朋友");
    }

    public void playWithStranger() {
        Stranger stranger = new Stranger();
        stranger.play();
    }
}

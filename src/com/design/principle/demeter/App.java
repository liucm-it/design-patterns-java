package com.design.principle.demeter;

/**
 * 甲向陌生人说话通过朋友，而不必知道陌生人
 */
public class App {
    public static void main(String[] args) {
        Jia jia = new Jia();
        jia.play(new Friend());
        jia.setFriend(new Friend());
        jia.getFriend().playWithStranger();
    }
}

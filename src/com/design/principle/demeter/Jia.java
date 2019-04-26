package com.design.principle.demeter;

public class Jia {
    private Friend friend;

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public void play(Friend friend) {
        friend.play();
    }
}

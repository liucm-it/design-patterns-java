package design.pattern.behavioral.templatemethod;

public class Chess extends Game {
    void initialize() {
        System.out.println("Chess Game Initialized! Start playing.");
    }

    @Override
    public boolean hasMusic() {
        return true;
    }

    void startPlay() {
        System.out.println("Chess Game Started. Enjoy the game!");
    }

    void endPlay() {
        System.out.println("Chess Game Finished!");
    }
}

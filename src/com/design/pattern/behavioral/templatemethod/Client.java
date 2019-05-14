package design.pattern.behavioral.templatemethod;

public class Client {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
        System.out.println();
        Game chess = new Chess();
        chess.play();
    }
}

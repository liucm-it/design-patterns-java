package design.pattern.structural.flyweight;

public class Client {

    public static void main(String[] args) {
        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();

        IgoChessman black1 = IgoChessmanFactory.getIgoChessman("black");
        IgoChessman black2 = IgoChessmanFactory.getIgoChessman("black");
        IgoChessman black3 = IgoChessmanFactory.getIgoChessman("black");
        System.out.println(black1 == black2);

        IgoChessman white1 = IgoChessmanFactory.getIgoChessman("white");
        IgoChessman white2 = IgoChessmanFactory.getIgoChessman("white");
        System.out.println(white1 == white2);

        black1.display(new Coordinates(1,2));
        black2.display(new Coordinates(1,9));

        white1.display(new Coordinates(3,2));
        white2.display(new Coordinates(5,9));
    }
}

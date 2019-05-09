package design.pattern.structural.flyweight;

import java.util.HashMap;

public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();

    private static HashMap hm;

    private IgoChessmanFactory() {
        hm = new HashMap();
        BlackIgoChessman black = new BlackIgoChessman();
        hm.put("black", black);
        WhiteIgoChessman white = new WhiteIgoChessman();
        hm.put("white", white);
    }

    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    public static IgoChessman getIgoChessman(String color) {
        return (IgoChessman) hm.get(color);
    }
}

package design.pattern.behavioral.memento;

public class Client {

    public static void main(String[] args) {
        MementoCaretaker mc = new MementoCaretaker();
        Chessman chess = new Chessman("车",1,1);
        mc.setMemento(chess.save()); //保存状态
        display(chess);

        chess.setY(4);
        mc.setMemento(chess.save()); //保存状态
        display(chess);

        chess.setX(5);
        display(chess);

        System.out.println("**********悔棋**********");
        chess.restore(mc.getMemento()); //恢复状态
        display(chess);

        System.out.println("*********再次悔棋********");
        chess.restore(mc.getMemento()); //恢复状态
        display(chess);
    }

    public static void display(Chessman chess) {
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }
}

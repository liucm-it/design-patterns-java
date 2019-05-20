package design.pattern.behavioral.memento;

import java.util.Stack;

public class MementoCaretaker {

    private Stack<ChessmanMemento> mementoStack = new Stack<>();

    public ChessmanMemento getMemento() {
        return mementoStack.pop();
    }

    public void setMemento(ChessmanMemento memento) {
        this.mementoStack.push(memento);
    }
}

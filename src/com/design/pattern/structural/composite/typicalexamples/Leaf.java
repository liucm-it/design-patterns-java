package design.pattern.structural.composite.typicalexamples;

public class Leaf extends Component {
    public void add(Component c) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    public Component getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public void operation() {

    }
}

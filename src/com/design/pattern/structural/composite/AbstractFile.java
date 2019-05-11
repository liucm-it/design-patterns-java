package design.pattern.structural.composite;

// 抽象文件类：抽象构件
public abstract class AbstractFile {
    public void add(AbstractFile file) {
        throw new UnsupportedOperationException();
    }

    public void remove(AbstractFile file) {
        throw new UnsupportedOperationException();
    }

    public AbstractFile getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void killVirus();
}

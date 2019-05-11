package design.pattern.structural.bridge;

public abstract class AbstractImage {
    protected SystemImp imp;

    public AbstractImage(SystemImp imp) {
        this.imp = imp;
    }

    public void setImp(SystemImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}

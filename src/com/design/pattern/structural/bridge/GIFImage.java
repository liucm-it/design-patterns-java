package design.pattern.structural.bridge;

public class GIFImage extends AbstractImage {

    public GIFImage(SystemImp imp) {
        super(imp);
    }

    public void parseFile(String fileName) {
        imp.doPaint();
        System.out.println(fileName + "，格式为GIF。");
    }
}

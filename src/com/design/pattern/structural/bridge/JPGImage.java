package design.pattern.structural.bridge;

public class JPGImage extends AbstractImage {

    public JPGImage(SystemImp imp) {
        super(imp);
    }

    public void parseFile(String fileName) {
        imp.doPaint();
        System.out.println(fileName + "，格式为JPG。");
    }
}

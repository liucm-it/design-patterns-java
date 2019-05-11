package design.pattern.structural.bridge;

public class BMPImage extends AbstractImage {
    public BMPImage(SystemImp imp) {
        super(imp);
    }

    public void parseFile(String fileName) {
        imp.doPaint();
        System.out.println(fileName + ". 格式BMP。");
    }
}

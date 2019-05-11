package design.pattern.structural.bridge;

import design.pattern.structural.bridge.AbstractImage;
import design.pattern.structural.bridge.SystemImp;

public class PNGImage extends AbstractImage {

    public PNGImage(SystemImp imp) {
        super(imp);
    }

    public void parseFile(String fileName) {
        imp.doPaint();
        System.out.println(fileName + "，格式为PNG。");
    }
}

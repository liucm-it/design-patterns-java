package design.pattern.structural.bridge;

public class Client {

    public static void main(String[] args) {
        AbstractImage gifImage = new GIFImage(new WindowsImp());
        gifImage.parseFile("Java设计模式");
    }
}

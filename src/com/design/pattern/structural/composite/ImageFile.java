package design.pattern.structural.composite;

public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }
}

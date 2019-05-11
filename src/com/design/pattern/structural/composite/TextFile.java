package design.pattern.structural.composite;

public class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println("----对文本文件'" + name + "'进行杀毒");
    }
}

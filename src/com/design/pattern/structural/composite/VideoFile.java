package design.pattern.structural.composite;

public class VideoFile extends AbstractFile {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println("----对视频文件'" + name + "'进行杀毒");
    }
}

package design.pattern.structural.composite;

import java.util.ArrayList;

public class Folder extends AbstractFile {
    private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
    private String name;
    private int level;

    public Folder(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    public void killVirus() {
        System.out.println("****对" + this.level + "级文件夹'" + name + "'进行杀毒");  //模拟杀毒
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}

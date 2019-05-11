package design.pattern.structural.bridge;

// Linux操作系统实现类：具体实现类
public class LinuxImp implements SystemImp {
    public void doPaint() {
        System.out.println("在Linux操作系统中显示图像：");
    }
}

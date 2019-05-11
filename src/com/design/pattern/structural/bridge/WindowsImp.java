package design.pattern.structural.bridge;

// Windows操作系统实现类：具体实现类
public class WindowsImp implements SystemImp {
    public void doPaint() {
        System.out.print("在Windows操作系统中显示图像：");
    }
}

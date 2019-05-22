package design.pattern.behavioral.command;

import java.util.ArrayList;

public class FBSettingWindow {
    private String title;

    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb) {
        functionButtons.remove(fb);
    }

    //显示窗口及功能键
    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (FunctionButton fb : functionButtons) {
            System.out.println(fb.getName());
        }
        System.out.println("------------------------------");
    }
}

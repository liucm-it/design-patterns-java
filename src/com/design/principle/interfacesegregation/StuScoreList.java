package com.design.principle.interfacesegregation;

public class StuScoreList implements InputModule, StatisticsModule, PrintModule {

    public static InputModule getInputModule()
    {
        return (InputModule)new StuScoreList();
    }

    public static StatisticsModule getStatisticsModule()
    {
        return (StatisticsModule)new StuScoreList();
    }

    public static PrintModule getPrintModule()
    {
        return (PrintModule)new StuScoreList();
    }

    public void insert() {
        System.out.println("输入模块insert()方法被调用");
    }

    public void delete() {
        System.out.println("输入模块delete()方法被调用");
    }

    public void update() {
        System.out.println("输入模块update()方法被调用");
    }

    public void printInfo() {
        System.out.println("打印模块printInfo()方法被调用");
    }

    public void queryInfo() {
        System.out.println("打印模块queryInfo()方法被调用");
    }

    public void statisticsTotalScore() {
        System.out.println("统计模块statisticsTotalScore()方法被调用");
    }

    public void statisticsAverage() {
        System.out.println("统计模块statisticsAverage()方法被调用");
    }
}

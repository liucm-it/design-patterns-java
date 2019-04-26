package com.design.principle.interfacesegregation;

public class App {
    public static void main(String[] args) {
        InputModule inputModule = StuScoreList.getInputModule();
        PrintModule printModule = StuScoreList.getPrintModule();
        StatisticsModule statisticsModule = StuScoreList.getStatisticsModule();

        inputModule.insert();
        printModule.printInfo();
        statisticsModule.statisticsTotalScore();
    }
}

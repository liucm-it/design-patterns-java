package design.pattern.creational.staticfactory;

public class App {
    public static void main(String[] args) {
        String chartType = XMLUtil.getChartType();
        Chart chart = StaticChartFactory.getChart(chartType);
        chart.display();
    }
}

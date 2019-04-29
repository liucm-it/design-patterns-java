package design.pattern.creational.staticfactory;

// 抽象图表接口：抽象产品类
interface Chart {
    void display();
}

// 柱状图类：具体产品类
class HistogramChart implements Chart {

    public HistogramChart () {
        System.out.println("创建柱状图！");
    }
    public void display() {
        System.out.println("显示柱状图！");
    }
}

// 饼状图类
class PieChart implements Chart {

    public PieChart() {
        System.out.println("创建饼状图！");
    }

    public void display() {
        System.out.println("显示饼状图！");
    }
}

// 折线图类
class LineChart implements Chart {

    public LineChart() {
        System.out.println("创建折线图！");
    }

    public void display() {
        System.out.println("显示折线图!");
    }
}

// 图表静态工厂类：工厂类
class StaticChartFactory {
    // 静态工厂方法
    public static Chart getChart(String type) {
        if ("histogram".equalsIgnoreCase(type)) {
            System.out.println("初始化设置柱状图！");
            return new HistogramChart();
        } else if ("pie".equalsIgnoreCase(type)) {
            System.out.println("初始化设置饼状图！");
            return new PieChart();
        } else if ("line".equalsIgnoreCase(type)) {
            System.out.println("初始化设置折线图！");
            return new LineChart();
        }
        return null;
    }
}

// 客服端
public class Client {
    public static void main(String[] args) {
        Chart histogram = StaticChartFactory.getChart("histogram");
        histogram.display();
    }
}

package desig.pattern.strategy;

public class ChildrenDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("五折儿童票：");
        return price * 0.5;
    }
}

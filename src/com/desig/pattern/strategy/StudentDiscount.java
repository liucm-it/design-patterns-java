package desig.pattern.strategy;

public class StudentDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("八折学生票：");
        return price * 0.8;
    }
}

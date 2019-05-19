package desig.pattern.strategy;

public class Client {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        double originalPrice = 60.0;
        movieTicket.setPrice(originalPrice);
        System.out.println("原价：" + originalPrice);
        System.out.println("===============================");
        movieTicket.setDiscount(new StudentDiscount());
        double discountPrice = movieTicket.getPrice();
        System.out.println("学生价：" + discountPrice);
    }
}

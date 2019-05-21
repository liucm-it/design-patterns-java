package design.pattern.behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        Medium md = new EstateMedium();    //房产中介
        Customer member1,member2;
        member1 = new Seller("甲(卖方-出售)");
        member2 = new Buyer("乙(买方-购买)");
        md.register(member1); //客户注册
        md.register(member2);
    }
}

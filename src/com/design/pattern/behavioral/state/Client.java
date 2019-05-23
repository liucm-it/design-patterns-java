package design.pattern.behavioral.state;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("阿狸", 0.0);
        account.withdraw(100);
        account.withdraw(1000);
        account.deposit(2000);
        account.withdraw(3000);
        account.withdraw(1000);
    }
}

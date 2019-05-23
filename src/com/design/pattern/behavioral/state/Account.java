package design.pattern.behavioral.state;

public class Account {
    private AccountState state;
    private String owner;
    private double balance = 0;

    public Account(String owner, double init) {
        this.state = new NormalState(this);
        this.owner = owner;
        this.balance = init;
        System.out.println(this.owner + "开户，初始金额为" + init);
        System.out.println("-----------------------------------");
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println(this.owner + "存款" + amount);
        state.deposit(amount); //调用状态对象的deposit()方法
        System.out.println("现在余额为"+ this.balance);
        System.out.println("现在帐户状态为: "+ this.state.getClass().getSimpleName());
        this.state.computeInterest();
        System.out.println("---------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "取款" + amount);
        state.withdraw(amount); //调用状态对象的withdraw()方法
        System.out.println("现在余额为"+ this.balance);
        System.out.println("现在帐户状态为"+ this. state.getClass().getSimpleName());
        this.state.computeInterest();
        System.out.println("---------------------------------------------");
    }

    public void computeInterest()
    {
        state.computeInterest(); //调用状态对象的computeInterest()方法
    }
}

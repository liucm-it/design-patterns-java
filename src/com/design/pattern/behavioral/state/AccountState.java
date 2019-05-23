package design.pattern.behavioral.state;

public abstract class AccountState {
    protected Account account;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void computeInterest();

    public abstract void stateCheck();
}

// 正常状态：具体状态类
class NormalState extends AccountState {
    public NormalState(Account account) {
        this.account = account;
    }

    public NormalState(AccountState state) {
        this.account = state.account;
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    public void computeInterest()
    {
        System.out.println("正常状态，无须支付利息！");
    }

    // 状态转换
    public void stateCheck() {
        if (account.getBalance() > -2000 && account.getBalance() <= 0) {
            account.setState(new OverdraftState(this));
        }
        else if (account.getBalance() == -2000) {
            account.setState(new RestrictedState(this));
        }
        else if (account.getBalance() < -2000) {
            System.out.println("操作受限！");
        }
    }
}

// 透支状态：具体状态类
class OverdraftState extends AccountState
{
    public OverdraftState(AccountState state) {
        this.account = state.account;
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    // 状态转换
    public void stateCheck() {
        if (account.getBalance() > 0) {
            account.setState(new NormalState(this));
        }
        else if (account.getBalance() == -2000) {
            account.setState(new RestrictedState(this));
        }
        else if (account.getBalance() < -2000) {
            System.out.println("操作受限！");
        }
    }
}

// 受限状态：具体状态类
class RestrictedState extends AccountState {
    public RestrictedState(AccountState state) {
        this.account = state.account;
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        System.out.println("帐号受限，取款失败");
    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    //状态转换
    public void stateCheck() {
        if(account.getBalance() > 0) {
            account.setState(new NormalState(this));
        }
        else if(account.getBalance() > -2000) {
            account.setState(new OverdraftState(this));
        }
    }
}


public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
        System.out.println("Withdrawn: $" + amount);
    }

    public void checkBalance() {
        System.out.println("Current Balance: $" + account.getBalance());
}
}

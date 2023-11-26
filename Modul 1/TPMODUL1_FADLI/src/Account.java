public class Account {
    private String privateName;
    private String accountNumber;
    private double balance;

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Saldo Invalid");
        } else {
            System.out.println("Anda Telah Mendeposit Sebesar " + amount);
            System.out.println("Deposit Berhasil");
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Anda telah Withdraw sebesar " + amount);
            System.out.println("Withdraw telah berhasil");
            return true;
        } else {
            System.out.println("Anda telah Withdraw sebesar " + amount);
            System.out.println("Withdraw gagal, nominal tidak cukup");
            return false;
        }
    }

    public String getPrivateName() {
        return privateName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
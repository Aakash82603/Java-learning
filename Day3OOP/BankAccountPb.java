package Day3OOP;

class BankAccount {
    private long accountNo;
    private String owner;
    private long balance;

    BankAccount(long accountNo, String owner) {
        this.accountNo = accountNo;
        this.owner = owner;
    }

    void deposit(long amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Amount must be less than or equal to balance.");
        } else {
            balance += amount;
        }


    }
    void withdraw(long amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Amount must be less than or equal to balance.");
        } else {
            balance -= amount;
        }
    }
    long getBalance() {
        return balance;
    }
     public String toString(){
        return "AccountNo: " +accountNo+", Owner: "+owner+", Balance: "+balance;

    }
}

public class BankAccountPb {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1, "Bob");
        bankAccount.deposit(1500);
        bankAccount.withdraw(2000);
        bankAccount.deposit(500);
        bankAccount.withdraw(2000);
        System.out.println(bankAccount);
    }
}

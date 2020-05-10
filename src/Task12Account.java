public class Task12Account {
    private String name;
    private int balance = 0;
    private boolean debit = false;
    private int maxDebit = -1000;

    // constructor
    public Task12Account(String name, int balance, int maxDebit) {
        this.name = name;
        this.balance = balance;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setDebit(boolean debit) {
        this.debit = debit;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isDebit() {
        return debit;
    }

    // other methods
    public void displayDetails (String transaction, int oldBalance, int amount) {
        System.out.println(this.name);
        System.out.println("Account balance: " + oldBalance + " | "
        + transaction +  " " + amount + " | "
        + "After transaction: " + this.balance);
    }

    public void deposit(int amount) {
        int oldBalance = this.balance;
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Amount has to be more than 0.");
        }
        if (this.balance > 0) {
            this.debit = false;
        }

       displayDetails("Deposit", oldBalance, amount);
    }

    public boolean withdraw(int amount) { // return true if transaction passed
        int oldBalance = this.balance;
        boolean passed = false;
        if (amount > 0) {
            if (this.balance - amount >= maxDebit) {
                this.balance -= amount;
                passed = true;
            } else {
                System.out.println("Maximum debit: " + this.maxDebit
                        + " reached. Withdraw is not possible.");
            }
        } else {
            System.out.println("Amount has to be more than 0.");
        }
        displayDetails("Withdraw", oldBalance, amount);

        return passed;
    }

    public void transfer (Task12Account other, int amount) {
        System.out.println("Transfer " + amount + " from: " + this.name );
        System.out.println("to: " + other.name );
        // withdraw from present account
        if (withdraw(amount)) {
            // deposit on other account
            other.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", debit=" + debit +
                ", maxDebit=" + maxDebit +
                '}';
    }
}

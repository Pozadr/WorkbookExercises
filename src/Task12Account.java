public class Task12Account {
    private String name;
    private int balance = 0;
    private boolean debit = false;
    private int maxDebit = -1000;

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setDebit(boolean debit) {
        this.debit = debit;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isDebit() {
        return debit;
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
        // display details
        System.out.println("Account balance: " + oldBalance + " | "
                + "Deposit: " + amount + " | "
                + "After transaction: " + this.balance);
    }

    public void withdraw(int amount) {
        int oldBalance = this.balance;
        if (amount > 0) {
            if (this.balance - amount >= maxDebit) {
                this.balance -= amount;
            } else {
                System.out.println("Maximum debit: " + this.maxDebit
                        + " reached. Withdraw is not possible.");
            }
        } else {
            System.out.println("Amount has to be more than 0.");
        }
        // display details
        System.out.println("Account balance: " + oldBalance + " | "
                + "Withdraw: " + amount + " | "
                + "After transaction: " + this.balance);
        if (this.balance < 0) {
            this.debit = true;
            System.out.println("You have the debit: " + this.balance
                    + " on your account.");
        }

    }


}

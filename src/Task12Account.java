public class Task12Account {
    private String name;
    private int balance = 0;
    private boolean debit = false;

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
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Amount has to be more than 0.");
        }
        if (this.balance > 0) {
            this.debit = false;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            this.balance -= amount;
        } else {
            System.out.println("Amount has to be more than 0.");
        }
        if (this.balance < 0) {
            this.debit = true;
            System.out.println("You have the debit on your account.");
        }
    }


}

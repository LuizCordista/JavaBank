import java.math.BigDecimal;

public class Account {
    double balance;
    String owner;

    public Account(String owner) {
        this.balance = 0.00;
        this.owner = owner;
    }

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void withDraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("$" + amount + "Has been withdraw with sucess");
        }
        else {
            System.out.println("You don't have this amount");
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("You have deposited: $" + amount + "with success!");
    }

    public String getStatus() {
        return "Your name: " + this.owner + "\nYour balance = " + this.balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance only accepts positive numbers");
        }
        else {
            this.balance = balance;
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

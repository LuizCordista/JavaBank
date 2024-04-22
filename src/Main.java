
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Luiz");
        Account account1 = new Account(user1.getName());
        account1.deposit(1000);
        account1.withDraw(50);
        System.out.println(account1.getStatus());
    }
}
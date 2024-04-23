import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        User user1 = new User(name);
        Account account1 = new Account(user1.getName());

        boolean running = true;

        while (running) {
            System.out.println("Select an option \n1. Deposit in your account \n2. Withdraw from your account \n3. See status \n4. Exit");
            String option = scanner.nextLine();
            System.out.println(option);

            double amount;

            switch (option) {
                case "1":
                    System.out.println("Amount: ");
                    amount = scanner.nextDouble();
                    account1.deposit(amount);
                    break;
                case "2":
                    System.out.println("Amount: ");
                    amount = scanner.nextDouble();
                    account1.withDraw(amount);
                    break;
                case "3":
                    System.out.println(account1.getStatus());
                    break;
                case "4":
                    running = false;
                    break;
            }
        }
    }
}
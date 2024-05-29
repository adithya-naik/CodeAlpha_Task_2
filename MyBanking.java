import java.util.*;
class BankAccount{
    private String accNum;
    private double balance;
    public BankAccount(String accNum) {
        this.accNum = accNum;
        this.balance = 0.0;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } 
        else {
            System.out.println("Insufficient funds");
        }
    }
    public double checkBalance() {
        return balance;
    }
}
public class MyBanking{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        BankAccount account = new BankAccount("7894561232");
        boolean choose = true;
        while (choose){
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = s.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = s.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Balance: " + account.checkBalance());
                    break;
                case 4:
                    choose = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        s.close();
    }
}

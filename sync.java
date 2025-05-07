class BankAccount {
 private int balance = 5000; // Initial balance
 // Synchronized method to withdraw money
 public synchronized void withdraw(String name, int amount) {
 System.out.println(name + " is trying to withdraw ₹" + amount);
 if (balance >= amount) {
 System.out.println(name + " is withdrawing ₹" + amount);
 try {
 Thread.sleep(1000); // Simulate transaction delay
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 balance -= amount;
 System.out.println(name + " successfully withdrew ₹" + amount);
 } else {
 System.out.println("❌ Insufficient balance for " + name);
 }
 System.out.println("Remaining Balance: ₹" + balance);
 System.out.println("--------------------------------");
 }
}
class Customer extends Thread {
 BankAccount account;
 String name;
 int amount;
  public Customer(BankAccount account, String name, int amount) {
 this.account = account;
 this.name = name;
 this.amount = amount;
 }
 public void run() {
 account.withdraw(name, amount);
 }
}
public class sync {
 public static void main(String[] args) {
 BankAccount account = new BankAccount(); // Shared account
 // Creating customer threads
 Customer customer1 = new Customer(account, "Ajay", 4000);
 Customer customer2 = new Customer(account, "Vijay", 3000);
 // Start both customers trying to withdraw money
 customer1.start();
 customer2.start();
 }
}
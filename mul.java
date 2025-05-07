class AlphabetThread extends Thread {
 public void run() {
 for (char ch = 'A'; ch <= 'Z'; ch++) {
 System.out.print(ch + " ");
 try {
 Thread.sleep(2000); // Sleep to simulate concurrency
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 }
 }
}
class NumberThread extends Thread {
 public void run() {
 for (int i = 1; i <= 26; i++) {
 System.out.print(i + " ");
 try {
 Thread.sleep(200); // Sleep to simulate concurrency
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 }
 }
}
public class mul {
 public static void main(String[] args) {
 AlphabetThread at = new AlphabetThread();
 NumberThread nt = new NumberThread();
 at.start(); // Start alphabet thread
 nt.start(); // Start number thread
 }
}

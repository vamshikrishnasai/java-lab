class Flight extends Thread {
 private String flightName;
 public Flight(String name) {
 this.flightName = name;
 }
 public void run() {
 System.out.println(flightName + " is landing... ");
 try {
 Thread.sleep(10000); // Simulate landing time
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 System.out.println(flightName + " has landed successfully!");
 }
}
public class priority {
 public static void main(String[] args) {
 // Creating flight threads
 Flight emergencyFlight = new Flight("Emergency Flight");
 Flight vipFlight = new Flight("VIP Flight");
 Flight commercialFlight = new Flight("Commercial Flight");
 Flight cargoFlight = new Flight("Cargo Flight");
 // Assigning thread priorities
 emergencyFlight.setPriority(Thread.MAX_PRIORITY); // 10 (Highest)
 vipFlight.setPriority(8); // 8 (High)
 commercialFlight.setPriority(5); // 5 (Normal)
 cargoFlight.setPriority(Thread.MIN_PRIORITY); // 2 (Lowest)
 // Starting threa
 commercialFlight.start();
 cargoFlight.start();
 emergencyFlight.start();
 vipFlight.start();
 }
}
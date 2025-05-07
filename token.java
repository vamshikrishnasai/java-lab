
import java.util.StringTokenizer;

public class token {

    public static void main(String[] args) {
        // Sample transaction record
        String transaction = "TXN123,Ram,5000,Deposit,2025-04-01";
        // Creating StringTokenizer to split based on comma
        StringTokenizer tokenizer = new StringTokenizer(transaction, ",");
        // Extracting details
        String txnID = tokenizer.nextToken();
        String customerName = tokenizer.nextToken();
        String amount = tokenizer.nextToken();
        String txnType = tokenizer.nextToken();
        String txnDate = tokenizer.nextToken();
        // Displaying extracted details
        System.out.println("Transaction Details:");
        System.out.println("Transaction ID: " + txnID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: $" + amount);
        System.out.println("Transaction Type: " + txnType);
        System.out.println("Date: " + txnDate);
    }
}

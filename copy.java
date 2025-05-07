import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class copy {
 public static void main(String[] args) {
 String inputFile = "input.txt"; // Input file name
 String outputFile = "output.txt"; // Output file name
 try
 {
 BufferedReader reader = new BufferedReader(new FileReader(inputFile));
 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
 String line;
 while ((line = reader.readLine()) != null) { // Read one line at a time
 writer.write(line); // Write the line to the output file
 writer.newLine(); // Add a newline character
 }
 writer.flush(); // Flush the writer to ensure all data is writte
 System.out.println("File copied successfully!");
 } catch (IOException e) {
 System.err.println("Error reading/writing file: " + e.getMessage());
 }
 }
}
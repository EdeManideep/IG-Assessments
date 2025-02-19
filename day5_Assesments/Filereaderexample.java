package day5;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Filereaderexample {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\MonikaAyyapu\\OneDrive - Insight Global, LLC\\Documents\\Product.txt";
//        		"C:\Users\MonikaAyyapu\OneDrive - Insight Global, LLC\Documents\Product.txt"
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

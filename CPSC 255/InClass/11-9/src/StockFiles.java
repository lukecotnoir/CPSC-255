import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class StockFiles {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner priceFS = new Scanner(new FileInputStream("Files/price.txt"));
        double price = priceFS.nextDouble();
        priceFS.close();

        Scanner sharesFS = new Scanner(new FileInputStream("Files/shares.txt"));
        int shares = sharesFS.nextInt();
        sharesFS.close();

        double total = price*shares;

        PrintWriter outFS = new PrintWriter(new FileOutputStream("Files/total.txt"));
        outFS.println(total);
        outFS.close();

    }
}

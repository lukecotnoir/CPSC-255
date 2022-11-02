import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOInClass {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFS = new Scanner(new FileInputStream("myoutfile.txt"));
        System.out.println(inFS.nextLine());
        inFS.close();
    }
}
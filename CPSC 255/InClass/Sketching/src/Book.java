import java.util.ArrayList;

public class Book {
    public static void main(String[] args) throws Exception {
        ArrayList<String> data = new ArrayList<String>(5);
        data.add("January");
        data.add("February");
        data.add("March");
        data.add("April");
        data.add("May");
        data.add("June");

        for (int p=0; p<data.size(); p = p+2)
            System.out.println(data.get(p));

    }
}

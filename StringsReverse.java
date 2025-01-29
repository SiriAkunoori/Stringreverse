import java.util.*;
public class StringsReverse {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);{
            System.out.println("Enter a String: ");
            String string=src.nextLine();
            String reverse=new StringBuilder(string).reverse().toString();
            System.out.println("Reversed String: "+reverse);
            src.close();
        }
    }
}

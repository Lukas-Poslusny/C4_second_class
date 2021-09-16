import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class NumberSplit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;
        String junk = sc.nextLine();

        for (int i = 0; i < junk.length(); i++) {
            if (Character.isDigit(junk.charAt(i)) ) {
                result += Character.getNumericValue(junk.charAt(i));
            }
        }
        System.out.println("Result: " + result);
    }
}

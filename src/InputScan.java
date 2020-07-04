import java.util.Scanner;

public class InputScan {
    Scanner scnr = new Scanner(System.in);

    /**
     * Sebagai scan dari string input user
     *
     * @param str merupakan inputan user
     * @return
     */
    public String input(String str) {
        System.out.print("input " + str + ": ");
        return scnr.next();
    }
}
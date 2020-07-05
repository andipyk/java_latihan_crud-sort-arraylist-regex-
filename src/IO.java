import java.util.Scanner;

public class IO {
    Scanner scnr = new Scanner(System.in);

    /**
     * Sebagai scan dari string input user
     *
     * @param str merupakan inputan user
     * @return
     */
    public String sInput(String str) {
        System.out.print("input " + str + ": ");
        return scnr.next();
    }

    public int iInput(String str) {
        System.out.print("input " + str + ": ");
        return scnr.nextInt();
    }

    public double dInput(String str) {
        System.out.print("input " + str + ": ");
        return scnr.nextDouble();
    }

}
package A9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Write something");
        Scanner in = new Scanner(System.in);
        String theInput = in.nextLine();
        System.out.println("You just wrote: " + theInput);
    }
}

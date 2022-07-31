import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Klasa {
    public static void main(String[] args) {

        // different Types Input
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Give a string: ");
        String text = scanner.nextLine();
        System.out.println("Give a integer:");
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println(" Give a double: ");
        double kropka = Double.valueOf(scanner.nextLine());
        System.out.println(" Give a boolean: ");
        boolean war = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string: " + text);
        System.out.println("You gave integer: " + integer);
        System.out.println("You gave double: " + kropka);
        System.out.println("You gave boolean: " + war);


    }
}

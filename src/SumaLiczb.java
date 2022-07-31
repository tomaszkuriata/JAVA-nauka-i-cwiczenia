import java.util.Scanner;

public class SumaLiczb {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a third number: ");
        int third = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is: " + (first + second + third));


    }


}

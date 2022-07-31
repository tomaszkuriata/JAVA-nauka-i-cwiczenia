import java.util.Scanner;

public class Dodawanie {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Podaj drugą liczbę: ");
        int y = Integer.valueOf(scanner.nextLine());
        System.out.println("Podaj trzecią liczbę: ");
        int z = Integer.valueOf(scanner.nextLine());
        int sum = x + y + z;
        System.out.println("Suma liczb wynosi: " + x + "+" + y + "+" + z + "=" + sum);
    }
}
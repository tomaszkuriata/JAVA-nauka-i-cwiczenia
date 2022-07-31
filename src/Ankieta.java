import java.util.Scanner;

public class Ankieta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię:");
        String name = scanner.nextLine();

        System.out.println("Podaj nazwisko: ");
        String surname = scanner.nextLine();

        System.out.println("Miejscowość:");
        String city;
        city = scanner.nextLine();

        System.out.println("Podaj wiek:");
        int age = scanner.nextInt();

        System.out.println("Podaj miesięczne zarobki brutto:");
        double salary = scanner.nextDouble();

        System.out.println("Sprawdź poprawność danych: ");
        System.out.println("Imię i nazwisko : " + name + " " + surname);
        System.out.println("Miejscowość: " + city);
        System.out.println("Wiek: " + age);
        System.out.println("Zarobki miesięczne brutto: " + salary + " złotych");


    }
}

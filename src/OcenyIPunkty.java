import java.util.Scanner;
public class OcenyIPunkty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe punktów");
        int punkty = scanner.nextInt();

        if (punkty == 0) {
            System.out.println("egzamin niezaliczony");
        } else if (punkty >= 1 && punkty <= 49) {
            System.out.println("egzamin poprawkowy");
        } else if (punkty >= 50 && punkty <= 59) {
            System.out.println("ocena niedostateczna");
        } else if (punkty >= 60 && punkty <= 69) {
            System.out.println("ocena dopuszczająca");
        } else if (punkty >= 70 && punkty <= 79) {
            System.out.println("odena dostateczna");
        } else if (punkty >= 80 && punkty <= 89) {
            System.out.println("ocena dobra");
        } else if (punkty >= 90 && punkty <= 99) {
            System.out.println("ocena barzo dobra");
        } else if (punkty >= 100 ) {
            System.out.println("ocena celująca");
        }


    }
}

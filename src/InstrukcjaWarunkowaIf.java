import java.util.Scanner;
public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int wiek = scanner.nextInt();

        if (wiek >0 && wiek < 18) {
            System.out.println("jesteś niepełnoletni");
        }
        if (wiek >= 18 && wiek <30) {
            System.out.println("jestes pelnoletni");
        }
        if (wiek > 30 && wiek < 50 ) {
            System.out.println("wiek sredni");
        }
        if (wiek > 50 && wiek < 100) {
            System.out.println("wiek dojrzaly");
        }
            else if(wiek >100) {
            System.out.println("blad(");
        }
    }
}

import java.sql.SQLOutput;
import java.util.Scanner;
public class Hasla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String haslo = "Agrest";
        String powtorkaHasla = "Agrest";

        System.out.println("podaj hasło");
        String podaj = scanner.nextLine();
        System.out.println("powtorz haslo");
        String powtorz = scanner.nextLine();



        boolean logiczne = (podaj.equals(haslo) && powtorz.equals(powtorkaHasla));

        if (logiczne) {
            System.out.println("Hasło sa takie same. Logowanie...");
        } else {
            System.out.println("Niepoprawne haslo.Hasla roznia sie od siebie!");
        }

    }
}

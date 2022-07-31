import java.util.Scanner;
public class Sekundy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = 60*60*24;
        System.out.println("Podaj liczbe dni");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("podałeś "+ first + " dni");
        System.out.println("Liczba sekund w podanej liczbie dni wynosi: " + (first*days) + " sekund");






    }
}

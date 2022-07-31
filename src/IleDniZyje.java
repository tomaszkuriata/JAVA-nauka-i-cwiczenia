import java.util.Scanner;
public class IleDniZyje {
    public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);

        System.out.println("Podaj rok urodzenia");
        int rok = scanner.nextInt();

        int obecnyRok = 2022;
        int dni = 365;
        int maj = 156;
        int przestepnyRok = 10;


        System.out.println("Żyjesz "+ "" + (((obecnyRok - rok ) * dni) -przestepnyRok));
    }
}

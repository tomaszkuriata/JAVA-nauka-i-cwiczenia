import java.util.Scanner;
public class Podatki{

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int podatek1 = 100;
        int podatek2 = 1700;
        int podatek3 = 4700;
        int podatek4 = 22100;
        int podatek5 = 142100;
        double stawka0 =0;
        double stawka1 = 0.08;
        double stawka2 = 0.10;
        double stawka3 = 0.12;
        double stawka4 = 0.15;
        double stawka5 = 0.17;

        System.out.println("Podaj wartość prezentu.");
        System.out.println("Na podstawie kwoty prezentu zostanie obliczona kwota podatku w €.");
        System.out.println("");


        int wartosc = Integer.valueOf(scanner.nextInt());
        System.out.println("Wartość prezentu = " +wartosc+ "€");

        if (wartosc<5000){
            System.out.println("Brak podatku!");
            System.out.println("Stawka "+stawka0 +"%");
        } else if (wartosc >=5000 && wartosc <= 25000){
            System.out.println("Podatek do zaplaty: "+(podatek1+(wartosc-5000)*stawka1)+"€");
            System.out.println("Stawka "+ stawka1+ "%");
        } else if (wartosc >25000 && wartosc <=55000){
            System.out.println("Podatek do zaplaty: "+(podatek2+(wartosc-25000)*stawka2) +"€");
            System.out.println("stawka "+stawka2+"%");
        } else if (wartosc > 55000 && wartosc <=200000){
            System.out.println("Podatek do zaplaty: "+(podatek3+(wartosc-55000)*stawka3)+"€");
            System.out.println("stawka "+ stawka3+"%");
        } else if (wartosc > 200000 && wartosc <=1000000){
            System.out.println("Podatek do zaplaty: "+(podatek4+(wartosc-200000)*stawka4)+"€");
            System.out.println("stawka "+stawka4+"%");
        } else if (wartosc>1000000){
            System.out.println("Podatek do zaplaty:"+(podatek5+(wartosc-1000000)*stawka5)+"€");
            System.out.println("stawka "+stawka5+"%");
        }


    }
}
import java.util.Scanner;

// Kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran program.

public class Main {
    public static void main(String[] args) {

        double elma = 3.67, armut = 2.14, domates = 1.11, muz = 0.95, patlican = 5,kilo,tutar;
        Scanner src=new Scanner(System.in);

        System.out.println("Lütfen Elmadan kaç kilo aldığınızı yazın..");
        kilo=src.nextDouble();
        tutar=elma*kilo;
        System.out.println("Lütfen Armuttan kaç kilo aldığınızı yazın..");
        kilo=src.nextDouble();
        tutar+=armut*kilo;
        System.out.println("Lütfen Domatesten kaç kilo aldığınızı yazın..");
        kilo=src.nextDouble();
        tutar+=domates*kilo;
        System.out.println("Lütfen Muzdan kaç kilo aldığınızı yazın..");
        kilo=src.nextDouble();
        tutar+=muz*kilo;
        System.out.println("Lütfen Patlıcandan kaç kilo aldığınızı yazın..");
        kilo=src.nextDouble();
        tutar+=patlican*kilo;
        System.out.println("Toplam Ödemeniz gereken tutar -> "+tutar);


    }
}


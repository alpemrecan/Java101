import java.util.Scanner;

//taksimetre 10tl ile başlar.En kısa mesafe ücreti 20tldir.

public class Main {
    public static void main(String[] args) {

        double km,ilkTutar,sonTutar;

        Scanner src=new Scanner(System.in);
        System.out.println("Lütfen mesafeyi giriniz ?(Km cinsinden)");
        km=src.nextDouble();

        ilkTutar=10+(km*2.20);
        boolean sonuc = ilkTutar>=20;

        sonTutar=sonuc? sonTutar=ilkTutar : 20;

        System.out.println("Ödemeniz gereken ücret "+sonTutar);




    }
}

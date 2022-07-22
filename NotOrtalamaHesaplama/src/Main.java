import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int fizik,kimya,turkce,tarih,muzik;

        Scanner sonuc=new Scanner(System.in);
        System.out.print("Lütfen Fizik Notunuzu Giriniz.");
        fizik=sonuc.nextInt();

        System.out.print("Lütfen Kimya Notunuzu Giriniz.");
        kimya=sonuc.nextInt();

        System.out.print("Lütfen Türkçe Notunuzu Giriniz.");
        turkce=sonuc.nextInt();

        System.out.print("Lütfen Tarih Notunuzu Giriniz.");
        tarih=sonuc.nextInt();

        System.out.print("Lütfen Müzik Notunuzu Giriniz.");
        muzik=sonuc.nextInt();

        int ortalama = (fizik+kimya+turkce+tarih+muzik)/5;
        boolean ort = ortalama >= 60;
        String sonSonuc = ort ?"Geçtin Tebrikler!!" : "Kaldın!!!";

        System.out.println("Ortalaman " + ortalama);
        System.out.println(sonSonuc);




    }
}
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

        if (0>fizik || fizik>100){
            fizik=0;
        }
        if (0>kimya || kimya>100){
            kimya=0;
        }
        if (0>turkce || turkce>100){
            turkce=0;
        }
        if (0>tarih || tarih>100){
            tarih=0;
        }
        if (0>muzik || muzik>100){
            muzik=0;
        }
        double ortalama = (fizik+kimya+turkce+tarih+muzik)/5;

        if (ortalama>=55){
            System.out.println("Sınıfı geçtin TEBRİKLER!!\nOrtalaman-> " +ortalama );
        }else {
            System.out.println("Sınıfı geçemedin..\nOrtalaman->"+ortalama);
        }
    }
}

import java.util.Scanner;

// kullanıcıdan boy ve kilo değerlerini alıp "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırılır.



public class Main {
    public static void main(String[] args) {
        double kilo,boy,vki;
        Scanner src= new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu giriniz..");
        kilo=src.nextDouble();
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz..");
        boy=src.nextDouble();
        vki=kilo/(boy*boy);
        System.out.println("Vücüt Kitle İndeksiniz -> "+vki);


    }
}

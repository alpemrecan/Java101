import java.util.Scanner;

// Basic hesap makinesi yapımı..

public class Main {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner src = new Scanner(System.in);
        System.out.println("İlk Sayıyı giriniz..");
        n1=src.nextInt();
        System.out.println("İkinci Sayıyı giriniz..");
        n2=src.nextInt();

        System.out.println("Yapacağınız işlemi seçiniz..");
        System.out.println(" 1->Toplama\n 2->Çıkarma\n 3->Çarpma\n 4->Bölme");
        select=src.nextInt();

        switch (select){

            case 1:
                System.out.println("Sonuç -> "+(n1+n2));
                break;
            case 2:
                System.out.println("Sonuç -> "+(n1-n2));
                break;
            case 3:
                System.out.println("Sonuç -> "+(n1*n2));
                break;
            case 4:
                System.out.println("Sonuç -> "+(n1/n2));
                break;
            default:
                System.out.printf("Hatalı Giriş yaptınız..");
        }

    }
}

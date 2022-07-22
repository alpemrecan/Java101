import java.util.Scanner;
        /*
         Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
         Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
         KDV tutarı hesaplayan programı yazınız.
         */

public class Main {
    public static void main(String[] args) {


        float ilkFiyat,kdvFiyat,kdv;


        Scanner sonuc =new Scanner(System.in);
        System.out.println("Fiyatı Giriniz..");
        ilkFiyat=sonuc.nextInt();

        boolean kdvTutari= (ilkFiyat<1000) && (ilkFiyat>0);
        kdv= kdvTutari ? 0.18f : 0.08f;

        kdvFiyat=ilkFiyat*kdv;
        ilkFiyat+=(kdvFiyat);

        System.out.println("KDV dahil fiyatı "+ilkFiyat+" Tl");
        System.out.println("KDV Tutarı "+kdvFiyat+" Tl");







    }
}
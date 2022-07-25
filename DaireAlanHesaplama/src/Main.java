import java.util.Scanner;

// Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program.

public class Main {
    public static void main(String[] args) {

        int r;
        double pi=3.14,x,alan;

        Scanner scr = new Scanner(System.in);
        System.out.println("Lütfen Alanını Hesaplamak istediğiniz Dairenin yarı çapını giriniz..");
        r=scr.nextInt();
        System.out.println("Lütfen Alanını Hesaplamak istediğiniz Dairenin Merkez Açısının ölçüsünü giriniz..");
        x=scr.nextDouble();

        alan=(pi*(r*r)*x)/360;

        System.out.println("Dairenin alanı -> "+alan);


    }
}

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int a,b,c,u,alan,cevre;
        Scanner src=new Scanner(System.in);
        System.out.println("Üçgenin bir kenarının uzunluğunu giriniz..");
        a=src.nextInt();
        System.out.println("Üçgenin ikinci kenarının uzunluğunu giriniz..");
        b=src.nextInt();
        System.out.println("Üçgenin üçüncü kenarının uzunluğunu giriniz..");
        c=src.nextInt();

        u=(a+b+c)/2;
        cevre=2*u;
        alan=u*(u-a)*(u-b)*(u-c);

        System.out.println("Verilen üçgenin çevresi "+cevre);
        System.out.println("Verilen üçgenin alanı "+alan);


    }
}

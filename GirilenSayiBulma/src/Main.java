import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,k=0,l=0,ort;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz.. -> ");
        number=input.nextInt();

        for (int i=0;i<=number; i++){
            if ((i%3==0) || (i%4==0)){
                k+=i;
                l++;
            }

        }
        ort=k/(l-1);

        System.out.println("Verdiğin sayıya kadar olan bölünür sayıların ortalaması -> "+ort);
    }
}

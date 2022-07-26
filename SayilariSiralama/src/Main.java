import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz");
        sayi1=input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        sayi2=input.nextInt();
        System.out.println("Lütfen üçüncü sayıyı giriniz");
        sayi3=input.nextInt();

        if (sayi1<sayi2 && sayi1<sayi3){
            if (sayi2<sayi3){
                System.out.println(sayi1+" < "+sayi2+" < "+sayi3);
            }else {
                System.out.println(sayi1+" < "+sayi3+" < "+sayi2);
            }
        } else if (sayi2<sayi1 && sayi2<sayi3) {
            if (sayi1<sayi3){
                System.out.println(sayi2+" < "+sayi1+" < "+sayi3);
            }else {
                System.out.println(sayi2+" < "+sayi3+" < "+sayi1);
            }
        }else  {
            System.out.println(sayi3+" < "+sayi2+" < "+sayi1);
        }
    }
}

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sicaklik;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Bulunduğunuz yerin sıcaklığını giriniz..");
        sicaklik=input.nextDouble();

        if (sicaklik<5){
            System.out.println("Tam Kayak Yapmalık bir gün..");
        } else if (sicaklik>5 && sicaklik<15) {
            System.out.println("Tam Sinamaya gitmelik bir gün..");
        } else if (sicaklik > 15 && sicaklik < 25) {
            System.out.println("Tam Piknik yapmalık bir gün..");
        }else {
            System.out.println("Tam Yüzmelik bir gün..");
        }
    }
}

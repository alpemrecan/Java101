import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age,tip;
        double distance,price,discount;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen gidiceğiniz mesafeyi KM cinsinden yazınız.. -> ");
        distance=input.nextDouble();
        System.out.print("Lütfen yaşınızı giriniz.. -> ");
        age=input.nextInt();
        System.out.println("Lütfen yolculuk tipinizi seçiniz..(1->Tek yön,2->Gidiş Dönüş)");
        tip=input.nextInt();

        if (distance>0 && age>0 && (tip<3 && tip>0)){
            if (age<12){
                discount=0.5;
                price=(distance*0.10)*discount;
            } else if (age>12 && age<65) {
                discount=0.90;
                price=(distance*0.10)*discount;
            }else{
                discount=0.70;
                price=(distance*0.10)*discount;
            }
            if (tip==2){
                discount=0.80;
                price=price*discount;
                System.out.print("Uçak biletinizin fiyatı -> "+price);
            }else {
                System.out.print("Uçak biletinizin fiyatı -> "+price);
            }

        }else {
            System.out.print("Hatalı Giriş Yaptınız!! Tekrar deneyin..");
        }
    }
}

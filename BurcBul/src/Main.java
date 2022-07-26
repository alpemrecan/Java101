import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day;
        String month;
        Scanner input= new Scanner(System.in);
        System.out.print("Doğum ayınızı giriniz : ");
        month=input.nextLine();
        System.out.print("Doğum gününüzü giriniz : ");
        day=input.nextInt();

        if (month.equals("ocak")){
            if (day<22){
                System.out.println("Oğlak Burcusun..");
            }else {
                System.out.println("Kova Burcusun..");
            }
        } else if (month.equals("şubat")) {
            if (day<20){
                System.out.println("Kova Burcusun..");
            }else {
                System.out.println("Balık Burcusun..");
            }
        } else if (month.equals("mart")) {
            if (day<21){
                System.out.println("Balık Burcusun..");
            }else {
                System.out.println("Koç Burcusun..");
            }
        }else if (month.equals("nisan")) {
            if (day<21){
                System.out.println("Koç Burcusun..");
            }else {
                System.out.println("Boğa Burcusun..");
            }
    }else if (month.equals("mayıs")) {
            if (day<22){
                System.out.println("Boğa Burcusun..");
            }else {
                System.out.println("İkizler Burcusun..");
            }
        }else if (month.equals("haziran")) {
            if (day<23){
                System.out.println("İkizler Burcusun..");
            }else {
                System.out.println("Yengeç Burcusun..");
            }
        }else if (month.equals("temmuz")) {
            if (day<23){
                System.out.println("Yengeç Burcusun..");
            }else {
                System.out.println("Aslan Burcusun..");
            }
        }else if (month.equals("ağustos")) {
            if (day<23){
                System.out.println("Aslan Burcusun..");
            }else {
                System.out.println("Başak Burcusun..");
            }
        }else if (month.equals("eylül")) {
            if (day<23){
                System.out.println("Başak Burcusun..");
            }else {
                System.out.println("Terazi Burcusun..");
            }
        }else if (month.equals("ekim")) {
            if (day<23){
                System.out.println("Terazi Burcusun..");
            }else {
                System.out.println("Akrep Burcusun..");
            }
        }else if (month.equals("kasım")) {
            if (day<22){
                System.out.println("Akrep Burcusun..");
            }else {
                System.out.println("Yay Burcusun..");
            }
        }else if (month.equals("aralık")) {
            if (day<22){
                System.out.println("Yay Burcusun..");
            }else {
                System.out.println("Oğlak Burcusun..");
            }
        }
    }
}

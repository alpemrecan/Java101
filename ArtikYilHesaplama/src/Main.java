import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Bir Yıl Yazınız.. -> ");
        year=input.nextInt();

        if (year%100==0){
            if (year%400==0){
                System.out.println(year+"-> Artık bir yıldır!");
            }else {
                System.out.println(year+"-> Artık bir yıl değildir!");
            }
        }else {
            if (year%4==0){
                System.out.println(year+"-> Artık bir yıldır!");
            } else {
                System.out.println(year+"-> Artık bir yıl değildir!");
            }
        }
    }
}

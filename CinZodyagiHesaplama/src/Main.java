import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year,number;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Doğduğunuz yılı giriniz.. -> ");
        year=input.nextInt();
        number=year%12;
        switch (number){
            case 0:
                System.out.println("Çin Zodyağı Burcunuz-> Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz-> Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz-> Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz-> Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz-> Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz-> Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz-> Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz-> Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz-> Ejderya");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz-> Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz-> At");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz-> Koyun");
                break;

        }
    }
}

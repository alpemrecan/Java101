import java.util.Scanner;

// kullanıcı adı ve sifre sorgulayan,
// yanlıs sifrede eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
// şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu"
// kullanıcı adı: aec - şifre: aec123
public class Main {
    public static void main(String[] args) {

        String username,password,newPassword,a;
        Scanner src = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz.. -> ");
        username=src.nextLine();
        System.out.print("Şifrenizi giriniz.. -> ");
        password=src.nextLine();

        if (username.equals("aec")&&password.equals("aec123")){
            System.out.println("Sisteme Giriş yaptınız..");
        }
        else{
                System.out.println("Hatalı Giriş yaptınız!!");
                System.out.println("Şifrenizi Yenilemek ister misiniz ?");
                a=src.nextLine();
                if (a.equals("evet")){
                    System.out.println("Yeni şifreyi giriniz.. ->");
                    newPassword=src.nextLine();
                    if (newPassword.equals("aec123")){
                        System.out.println("Eski Şifreniz ile aynı lüften farklı bir şifre giriniz..->");
                    }else {
                        System.out.println("Yeni şifresiniz oluşturuldu..");
                    }

                }
            }

    }
}

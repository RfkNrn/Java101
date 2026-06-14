import java.util.Scanner;

class UserNamePassword {
    static void main() {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifreyi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Sisteme girdiniz");
        } else if (userName.equals("patika")) {

            System.out.println("Yanlış parola girdiniz. Parolayı sıfırlamak ister misiniz?\n1- Evet\n2- Hayır");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Yeni parolayı girin: ");
                    String newPassword = new Scanner(System.in).nextLine();

                    if (newPassword.equals("java123")) {
                        System.out.println("Eski paroladan farklı bir parola girmelisiniz!");
                    } else {
                        System.out.println("Yeni parola oluşturuldu.");
                    }

                    break;

                case 2:
                    System.out.println("Parolayı değiştirmediniz. Sisteme girilemedi!");
                    break;
                default:
                    System.out.println("Seçim yapmadınız. Sisteme girilemedi");
            }
        } else
        {
            System.out.println("Kullanıcı bulunamadı!");
        }

        input.close();
    }
}

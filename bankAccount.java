import java.util.Scanner;

public class bankAccount {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = "patika", password = "1234", storedUserName, storedPassword;
        int balance = 1500, tryCount = 3, opSelect, liquidWithdraw;
        boolean isAccountInfoTrue = false;
        do {
            if (tryCount == 0) {
                System.out.println("Hesabınız bloke olmuştur!");
                break;
            }
            System.out.print("Kullanıcı adı giriniz: ");
            storedUserName = scan.nextLine();
            System.out.print("Parola giriniz: ");
            storedPassword = scan.nextLine();

            if (!storedUserName.equals(userName)) {
                System.out.println("Kullanıcı adı bulunamadı!");
                tryCount--;
                System.out.println("Kalan giriş hakkınız " + tryCount);
                continue;
            }
            if (!storedPassword.equals(password)) {
                System.out.println("Parola yanlış!");
                tryCount--;
                System.out.println("Kalan giriş hakkınız " + tryCount);
                continue;
            }
            isAccountInfoTrue = true;
        } while (!isAccountInfoTrue);

        if (isAccountInfoTrue) {
            System.out.println("Hesaba giriş yaptınız.");
            do {
                System.out.println("1-Para yatırma" +
                        "\n2-Para çekme" +
                        "\n3-Bakiye sorgulama" +
                        "\n4-Çıkış");
                System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                opSelect = scan.nextInt();

                switch (opSelect){
                    case 1:
                        System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                        balance += scan.nextInt();
                        System.out.println("Para yatırma işleminiz tamamlanmıştır.");
                        break;
                    case 2:
                        System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                        liquidWithdraw = scan.nextInt();
                        if (liquidWithdraw > balance) {
                            System.out.println("Bakiyeniz yeterli değil!");
                            break;
                        }
                        balance -= liquidWithdraw;
                        System.out.println("Para çekme işleminiz tamamlanmıştır.");
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + balance + "-TL");
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Geçerli bir işlem seçmediniz!");
                        break;
                }
            }while (opSelect!=4);

            System.out.println("Hesaptan çıkış yaptınız.");
            scan.close();
        }
    }
}
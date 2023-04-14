import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextInt();

        System.out.print("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme\nİşlemi seçiniz: ");
        select = input.nextInt();
        input.close();

        String last = "Sonuç: ";
        switch (select) {
            case 1:
                System.out.println(last + (a + b));
                break;
            case 2:
                System.out.println(last + (a - b));
                break;
            case 3:
                System.out.println(last + (a * b));
                break;
            case 4:
                try{
                    System.out.println(last + (a / b));
                    break;
                }catch (Exception e){
                    System.out.println("Sayılar 0'a bölünemez.");
                    break;
                }
            default:
                System.out.println("Geçerli bir işlem numarası girmediniz.");
        }
    }
}

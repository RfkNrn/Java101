import java.util.Scanner;

public class activityHeat {
    static void main() {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz: ");
        heat = input.nextInt();
        input.close();

        if (heat<5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat>25) {
            System.out.println("Yüzebilirsiniz.");
        } else if (heat>15) {
            System.out.println("Piknik yapabilirsiniz.");
        } else {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
    }
}

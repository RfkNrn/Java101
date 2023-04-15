import java.util.Scanner;

public class FlightCalculator {
    public static void main(String[] args){
        float perKM = 0.1f, ageRatio, flightTripRatio = 1.0f;
        int flightDistance, age, flightTrip;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        flightDistance = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        if(flightDistance < 0 || age < 0){
            System.out.println("Hatalı veri girdiniz!");
            System.exit(1);
        }

        if(age < 12){
            ageRatio = 0.5f;
        } else if (age < 24) {
            ageRatio = 0.9f;            
        } else if (age > 65) {
            ageRatio = 0.7f;
        } else {
            ageRatio = 1.0f;
        }

        System.out.print("Yolculuk tipini giriniz\n(1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        flightTrip = input.nextInt();
        if (flightTrip == 2) {
            flightTripRatio = 1.6f;
        } else if (flightTrip != 1) {
                System.out.println("Hatalı seçim yaptınız!");
                System.exit(1);}

        input.close();

        String totalPrice = String.format("%.2f", (perKM * flightDistance * ageRatio * flightTripRatio));
        System.out.println("Toplam Tutar = " + totalPrice + " TL");
    }
}

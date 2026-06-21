import java.util.Scanner;

public class horoscope {
    public static void main() {
        String horoscope = "";
        int day, month;
        boolean monthError = false, dayError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Günü giriniz: ");
        day = input.nextInt();
        System.out.print("Ayı giriniz: ");
        month = input.nextInt();
        input.close();
        
        if (month < 1 || month > 12) {
            monthError = true;
        }
        
        if (day < 1) {
            dayError = true;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                dayError = true;
            }
        } else if (month == 2) {
            if (day > 29) {
                dayError = true;
            }
        } else {
            if (day > 31) {
                dayError = true;
            }
        }

        if (monthError) {
            System.out.println("Yanlış ay değeri girdiniz!");
        }
        if (dayError) {
            System.out.println("Yanlış gün değeri girdiniz!");
        }

        if (!monthError || !dayError) {
            if (month > 5 && month < 11) {
                if  (day > 22) {
                    switch (month) {
                        case 6:
                            horoscope = "Yengeç";
                            break;
                        case 7:
                            horoscope = "Aslan";
                            break;
                        case 8:
                            horoscope = "Başak";
                            break;
                        case 9:
                            horoscope = "Terazi";
                            break;
                        case 10:
                            horoscope = "Akrep";
                            break;
                    }
                } else  {
                    switch (month) {
                        case 6:
                            horoscope = "İkizler";
                            break;
                        case 7:
                            horoscope = "Yengeç";
                            break;
                        case 8:
                            horoscope = "Aslan";
                            break;
                        case 9:
                            horoscope = "Başak";
                            break;
                        case 10:
                            horoscope = "Terazi";
                            break;
                    }
                }
            } else if (month == 2) {
                if (day > 19) {
                    horoscope = "Balık";
                } else {
                    horoscope = "Kova";
                }
            }  else if (month == 3 || month == 4) {
                if (day > 20) {
                    switch (month) {
                        case 3:
                            horoscope = "Koç";
                            break;
                        case 4:
                            horoscope = "Boğa";
                            break;
                    }
                } else {
                    switch (month) {
                        case 3:
                            horoscope = "Balık";
                            break;
                        case 4:
                            horoscope = "Koç";
                            break;
                    }
                }
            } else {
                if (day > 21) {
                    switch (month) {
                        case 1:
                            horoscope = "Kova";
                            break;
                        case 5:
                            horoscope = "İkizler";
                            break;
                        case 11:
                            horoscope = "Yay";
                            break;
                        case 12:
                            horoscope = "Oğlak";
                            break;
                    }
                } else {
                    switch (month) {
                        case 1:
                            horoscope = "Oğlak";
                            break;
                        case 5:
                            horoscope = "Boğa";
                            break;
                        case 11:
                            horoscope = "Akrep";
                            break;
                        case 12:
                            horoscope = "Yay";
                            break;
                }
            }
        }

        if (!horoscope.equals("")) {
            System.out.println("Burcunuz: " + horoscope);
        }
    }
}}
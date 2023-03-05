//package rikkei.academy;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year;
//        System.out.println("Enter a year");
//        year = scanner.nextInt();
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.printf("%d is a leap year ", year);
//                } else {
//                    System.out.printf("%d is NOT a leap year ", year);
//                }
//            } else {
//                System.out.printf("%d is a leap year ", year);
//            }
//        } else {
//            System.out.printf("%d is NOT a leap year ", year);
//        }
//    }
//}


package rikkei.academy;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;

        boolean isDivsibleBy4 = year % 4 == 0;
        if(isDivsibleBy4){
            boolean isDivsibelBy100 = year % 100 == 0;
            if (isDivsibelBy100){
                boolean isDivsibelBy400 = year % 400 == 0;
                if(isDivsibelBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.printf("%d is a leap year ", year);
        } else {
            System.out.printf("%d is NOT a leap year !", year);
        }
    }
}
import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tax = 0, taxRate = 0;
        int lowerLimit = 0, taxAtLowerLimit = 0;

        System.out.println("Value of the gift?");
        int valueOfGift = Integer.valueOf(scanner.nextLine());

        if (valueOfGift >= 5000 && valueOfGift < 25000) {
            lowerLimit = 5000;
            taxAtLowerLimit = 100;
            taxRate = 0.08;
        } else if (valueOfGift >= 25000 && valueOfGift < 55000) {
            lowerLimit = 25000;
            taxAtLowerLimit = 1700;
            taxRate = 0.1;
        } else if (valueOfGift >= 55000 && valueOfGift < 200000) {
            lowerLimit = 55000;
            taxAtLowerLimit = 4700;
            taxRate = 0.12;
        } else if (valueOfGift >= 200000 && valueOfGift < 1000000) {
            lowerLimit = 200000;
            taxAtLowerLimit = 22100;
            taxRate = 0.15;
        } else {
            lowerLimit = 1000000;
            taxAtLowerLimit = 142100;
            taxRate = 0.17;
        }

        if (valueOfGift < 5000) {
            System.out.println("No tax!");
        } else {
            tax = taxAtLowerLimit + ((valueOfGift - lowerLimit) * taxRate);
            System.out.println("Tax: " + tax);
        }
    }
}
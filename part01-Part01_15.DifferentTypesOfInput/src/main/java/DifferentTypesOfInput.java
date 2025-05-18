import java.util.Scanner;

public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String inputString = scanner.nextLine();

        System.out.println("Give an integer:");
        int inputInt = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a double:");
        double inputDouble = Double.valueOf(scanner.nextLine());

        System.out.println("Give a boolean:");
        boolean inputBoolean = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + inputString);
        System.out.println("You gave the integer " + inputInt);
        System.out.println("You gave the double " + inputDouble);
        System.out.println("You gave the boolean " + inputBoolean);
    }
}
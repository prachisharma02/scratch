
import java.util.Scanner;

 class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int numberOfDigits = 0; // Initialize the digit count to 0

        while (number != 0) {
            number /= 10; // Remove the last digit
            numberOfDigits++; // Increment the digit count
        }

        number = originalNumber; // Restore the original number for the calculation
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
    


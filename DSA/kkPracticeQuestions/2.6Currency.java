import java.util.Scanner;

 class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount in Rupees (INR):");
        float amountINR = scanner.nextFloat();

        float exchangeRate = 83.12f;

        float amountUSD = amountINR / exchangeRate;

        System.out.println("Amount in USD: " + amountUSD+" USD");

        scanner.close();
    }
}

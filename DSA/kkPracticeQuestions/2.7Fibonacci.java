 import java.util.Scanner;

 class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = sc.nextInt();
        int num1 = 1;
        int num2 = 1;
        System.out.print("Fibonacci series: ");
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        for (int i = 0; i < n-2; i++) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3+" ");
        }
       


    }
}

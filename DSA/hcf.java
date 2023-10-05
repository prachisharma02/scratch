import java.util.Scanner;

class HCF {
    public static int HCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int LCM(int a, int b) {
        int hcf = HCF(a, b);
        return (a * b) / hcf;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b=sc.nextInt();

        int lcm = LCM(a, b);
        int hcf = HCF(a, b);

        System.out.println("HCF of " + a + " and " + b + " is " + hcf);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);

    }
}

import java.util.Scanner;

public class sum {
    public static int sum(int a ,int b){
        int sum=a+b;
        return sum;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b=sc.nextInt();
        int sum=sum(a,b);
        System.out.println("the sum is "+sum);
    }
}

import java.util.Scanner;

public class multiplication {
    public static void multiply(int n){
        for(int i=1;i<=10;i++){
            int m=n*i;
            System.out.println(n+" * "+ i+" = "+m);
        }
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        multiply(a);
}
    }


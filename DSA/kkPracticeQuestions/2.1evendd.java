import java.util.Scanner;
 class evendd {
    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("The number is even");
        }
        else
        System.out.println("The Number is odd");
    }
}

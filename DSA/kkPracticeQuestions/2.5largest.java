import java.util.Scanner;
class largest {
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter First number");
        int a= sc.nextInt();
        System.out.println("Enter Second Number ");
        int b=sc.nextInt();
        if(a>b)
        System.out.println("a is largest");
        else
        System.out.println("b is largest");
      }
}

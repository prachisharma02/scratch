import java.util.Scanner;

 class SI {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal amount");
        int p= sc.nextInt();
        System.out.println("Enetr Rate");
        int r=sc.nextInt();
        System.out.println("Enter time");
        int t= sc.nextInt();
        int si=p*r*t;
        System.out.println("the Simple Interest is "+si);
    }
}

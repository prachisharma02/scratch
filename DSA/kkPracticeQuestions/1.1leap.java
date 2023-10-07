import java.util.Scanner;

class leap {
    public static boolean leap(int year) {
      //  boolean leap=false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        else
        return false;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check");
        int a = sc.nextInt();
        boolean result = leap(a);
        if(result)
            System.out.println(a+" is a leap year");
        else
            System.out.println(a+" is not a leap year");
    }
}

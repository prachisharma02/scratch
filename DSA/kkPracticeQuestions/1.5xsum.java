import java.util.Scanner;

 class xsum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String s = "";
        
        while (true) {
            System.out.println("Enter a number or 'x' to finish:");
            s = sc.next();
            
            if (s.equalsIgnoreCase("x")) {
                break;
            }
            
            int a = Integer.parseInt(s);
            sum += a;
        }
        
        System.out.println("Sum is " + sum);
        
        
    }
}

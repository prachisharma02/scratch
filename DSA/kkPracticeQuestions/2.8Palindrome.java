import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String n = sc.next();
        boolean valid = true;
        int left = 0, right = n.length()-1;;
        for (int i = 0; i < n.length()/2; i++) {
            if (n.charAt(left) != n.charAt(right)) {
                valid = false;
            }
                left++;
                right--;
            
        }if (valid) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
        
        
        
    }
    
}

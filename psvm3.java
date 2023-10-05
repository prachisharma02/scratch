
// Overriding of main method is not applicable but here
//it is method hiding

public class psvm3 {
     public static void main(String[] args){
        System.out.println("parent main");
     }
}
class psvm4 extends psvm3{
    public static void main(String[] args){
        System.out.println("child main");
    }
}

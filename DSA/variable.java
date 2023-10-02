public class variable {
    int x=10; //instance variable
    public static void main(String[] args){ // p static v m is a static block
        // System.out.println(x); // cannot access instance var from static context/block
        variable v=new variable();
        System.out.println(v.x);
    }
}

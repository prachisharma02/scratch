public class exception2 {
    public static void main(String[] args) {
        int m=m1();
        System.out.println(m);
    }
    public static int m1(){
           try {
            System.out.println(10/5);
            return 765;
           }
           catch (Exception err) {
            System.out.println(err);
            return 776;
           }
           finally{
            return 777;
           }
        }
}

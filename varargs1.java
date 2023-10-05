public class varargs1 {
    //both are equal
    public static void v(int[] a){}
    public static void v2(int... a){}
    // (int...x)===(int[] x)
    //(int[]... x)===(int[][] x)
    //similarly
    // public static void main(String[] args) {
        
    // }
    //  public static void main(String... args) {
    //     // they both are eual
    // }

    // but there is difference in both if we take v(10),v(10,20) then it will be valid in varargs method only not in array cuz arrray require array values like v({10,20})
   // they are used for different purposes
}

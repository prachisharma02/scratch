public class nan {
    public static void main(String[] args) {
  
        //FALSE
        System.out.println(10<Float.NaN);
        System.out.println(10<=Float.NaN);
        System.out.println(10>Float.NaN);
        System.out.println(10>=Float.NaN);
        System.out.println(10 == Float.NaN);
          
        //TRUE
        System.out.println(10!=Float.NaN);
        System.out.println(Float.NaN!=Float.NaN);
    }
}

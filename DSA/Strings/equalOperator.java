public class equalOperator {
    public static void main(String[] args) {
  
        String a = "prachi";
        String b = "prachi";
        System.out.println(a==b); //true
        String s=new String("hello");
        String p = new String("hello");

        StringBuffer sb = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");

        // System.out.println(s == p); //false
        // System.out.println(sb == sb2); //false

        // String s2=s;
        // System.out.println(s == s2);//true
        
        // StringBuffer sb3=sb2;
        // System.out.println(sb3 == sb2); //true
        

    }
}

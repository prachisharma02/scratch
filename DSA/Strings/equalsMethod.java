public class equalsMethod {
    public static void main(String[] args) {
        String s = new String("hello");
        String p = new String("hello");
        String p2 = new String("HELLO");

        StringBuffer sb = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");

        //  EQUALS METHOD IS IN OBJECT CLASS AND CHECK REFERENCE ONLY NOT CONTENT
        // BUT STRING CLASS OVERRIDES IT AND MADE IT TO CHECK THE CONTENT THAT WHY EQUALS METHOD APPLIED FOR STRING GIVES TRUE
      
      //  System.out.println(s.equals(p)); //true
      // System.out.println(sb.equals(sb2)); //false becuz equals method is not overriden in stringbuffer class and it still checks  reference only
       
      System.out.println(s.equals(p2)); //false
      System.out.println(s.equalsIgnoreCase(p2)); //true

        String s2=s;
    //    System.out.println(s.equals(s2));//true
        
        StringBuffer sb3=sb2;
     // System.out.println(sb3.equals(sb2)); //true
     }
}

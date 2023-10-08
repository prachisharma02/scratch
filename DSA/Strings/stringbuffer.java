public class stringbuffer {
   public static void main(String[] args) {
      

        StringBuffer sb = new StringBuffer();//16
        sb.append("aviansh"); // capacity is 16 only
        System.out.println(sb.capacity()); // its appending
           
   //   but if we are initializing value in starting then capacity will get increased

        StringBuffer sb1 = new StringBuffer("prachi"); // it will add as 16+6 //22
        sb1.append("avinash");
        System.out.println(sb1.capacity());
        
     }
}

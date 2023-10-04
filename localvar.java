public class localvar {
    public static void main(String[] args) {
        // try {
        //     int j = Integer.parseInt("ten");
        // } catch (Exception e) {
            
        //     // j = 10; // cant access local variable outside try block
        //    System.out.println(e);
        // }
        //   System.out.println(j);// cant access local variable outside try block
     
        int x;// this is a local variable declared in main method so jvm will not set default value 
       // so if it is not accessed then no error if we access then error
        System.out.println("hello"); //only this statement thenno error 
      //  System.out.println(x);//error
    }
}

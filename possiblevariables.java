public class possiblevariables {
    // primitive : declared with primitive datatype
    // reference : object variables
    // POSSIBLE COMBINATIONS ARE : PRIMITIVE :instance ,static,local;
    //                             REFERENCE :instance ,static ,local;
    //     SO TOTAL 6 

    int x=10;  // instance primitive 
    static int a=20; // static primitive
    static String s = "prachi"; // static reference
    String q = " hello"; // instance reference
    
    // in case of default values of arrays / instance reference
    int[] data;
    int[] i = new int[3];
     void method(){
        int p=22; // local primitive
    }

    public static void main(String[] args) {
        possiblevariables p = new possiblevariables();

        int[] z = new int[3];// local reference
        System.out.println(p.data); //null
      //  System.out.println(p.data[0]); //null pointer exception
        System.out.println(p.i);  //address of i 
        System.out.println(p.i[0]);// 0
        
    }
}

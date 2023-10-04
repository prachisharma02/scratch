public class possiblevariables {
    // primitive : declared with primitive datatype
    // reference : object variables
    // POSSIBLE COMBINATIONS ARE : PRIMITIVE :instance ,static,local;
    //                             REFERENCE :instance ,static ,local;
    //     SO TOTAL 6 

    int x=10;  // instance primitive 
    static int a=20; // static primitive
    static String s = "prachi"; // static reference
    String q=   " hello"; // instance reference
    
     void method(){
        int p=22; // local primitive
    }
    public static void main(String[] args){
        int[] z=new int[3] ;// local reference
    }
}

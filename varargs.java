public class varargs {
    public static void sum(int... x) // valid
     {
        int sum = 0;
        for(int i=0;i<x.length;i++){
            sum += x[i];
    }
     System.out.println(sum);
}
    //  (int... x) //valid 
    //  (int    ...x)/ / valid  
    //  (int x...)//invalid
    //  (int.  ..x)//invalid
    //  (int   .x..)//
    
    //  MIXING OF VAR ARG PARAMETERS 
    //  if we are mixing then var arg parameter should be at end and only obe var arg argument is valid
    //  (int x...,String s) //invalid
    //  (char c,String s...) //valid
    //  (char x...,char y...)
   
       
    //    public static void m1(int s...) {}
    //    public static void m1(int []) together both not posssible
    
    public static void m(int... s)  {
        System.out.println("var args");
    }
    public static void m(int d){
        System.out.println("general method");
    }
    
    public static void main(String[] args) {
        sum(10, 20, 30);
        m(20,30);
        m();
        m(20);
    }
}

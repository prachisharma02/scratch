public class operator1 {
    public static void main(String[] args) {
        Thread t = new Thread();
    //     System.out.println(t instanceof Thread);
    //     System.out.println(t instanceof Runnable);
    //     System.out.println(t instanceof Object); // THERE SHOULD ALWAYS BE RELATION BETWEEN BOTH OPERANDS IT CAMT BE LIKE
    //    // System.out.println(t instanceof String); // it is eeror
     //   System.out.println(null instanceof Object);
        // FOR ANY CLASS OR INTERFACE X NULL INTYANT OF X IS FALSE




        // BITWISE OPERATORS => &(AND) |(OR) ^(X-OR) 
        // & RETURNS TRUE ONLY IF BOTH THR=E ARGUMENTS ARE TRUE
        // | RETURNS TRUE IF ATLEAST ONE ARGUMENT IS TRUE
        // ^ RETURNS TRUE IF BOTH ARGUMENST ARE DIFFERENT ELSE IF SBOTH ARGUMENTS ARE SAME IT WILL RETURN FALSE
        // System.out.println(true & false); //false
        // System.out.println(true | false); // true
        // System.out.println(true ^ false); // true
        // System.out.println(true ^ true); //false
        // System.out.println(false ^ false); //false
        // System.out.println(false ^ true); //true
       // System.out.println(~true);// error
       System.out.println(~4);
       System.out.println(~5); // only for integral
       // System.out.println(!5); ! only for boolean types
        

    }
}

public class shortOperators {
    public static void main(String[] args) {

        // SHORT CIRCUIT OPERATORS
        //&&  whwre both the parts are not nededed to evaluate instead of solving both parts in & 

        //  if(false && true) // no need to evalutae true cuz false and with anyone will be false
        // if( true || true ) // true no need of evaluating other part true ke sath other add krenge to true he hoga
         int x = 10, y = 15;
        // if (++x < 10 & ++y > 15) {
        //     x++;
        // } else
        //     y++;

        // System.out.println(x + " " + y);// 11 17
  
        // if(++ x<10 | ++ y>15){ // y yaha pe bs ek bar isisliy 16
        //         x++;
        //     }
        //     else
        //     y++; //ek yaha pe
            
        // System.out.println(x + " " + y); // 12 16
        // if(++ x<10 && ++ y>15){ // y yaha pe increment nhi hoga x condition false h to second part evaluate he nhi hoga to
        //         x++;
        //     }
        //     else
        //     y++; //ek yaha pe bs y 
            
        // System.out.println(x + " " + y); // 11 16
         if(++ x<10 || ++ y>15){ // y yaha pe increment  hoga x condition false h to second part evaluate  hoga to
                x++;
            }
            else
            y++; //ek yaha pe bs y 
            
        System.out.println(x + " " + y); // 12 16
    }
}

public class flowcontrol {
 public static void main(String[] args) {
//      int x = 0;
//      if (x) {                           in java boolean values are only true and false so x=0 is not boolean and flow 
                                        // control needs boolean value to execute  so error
//          System.out.println(6);
//      }
//      else
//      System.out.println(9);
if (true)
    System.out.println("hello"); // valid

    if(true)
    {
        int x = 10;
    }
//      if(true)  // invald
//         int x = 10; // invalid cuz declarations of x is done but no use of x we cant use x furthur 


if(true)
if(false)
    System.out.println("hello");
else // this else is related to nearest if means above this hello if
    System.out.println("hi");


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                      SWITCH STATEMENTS ONLY CONTAIN INT BOOLEAN CHAR BYTE SHORT STRING ALL WRAPPER CLASS

// NOT FLOAT DOUBLE LONG



int a = 10;
final int b = 20; // making it final makes b constant then valid 
switch (a) {
    case 10:
        System.out.println("hi");
    case b: // ERROR every case must be constant not a variable
    System.out.println("hwllo");
}




}
}

public class operator {
    public static void main(String[] args) {
        System.out.println('a'<'A'); //false 97<65
        System.out.println('a'>10);  //true 97>10
        System.out.println('a'<97.6); //true 97.0<97.6
       // System.out.println(true>false);

        //EQUALITY OPERATOR
        Thread t=new Thread();
        Object o=new Object();
        String s=new String("prachi");
        //AS for equality operator there should be a relation between both the operands
        System.out.println(t==o); //object is parent for
        System.out.println(o==s); // object parent for string
      //  System.out.println(t==s);//error  no relation b/w thread and string

    }
}

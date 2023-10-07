class Dividebyzero {


    //  ARITHEMATIC EXCEPTION key points to remember
    //  1. it is a runtime exception not compile time error
    //  2. it occurs only while performing operation on integral values not in floating values
    //  3. it is only caused by two opperators / , %
     


    public static void main(String[] args) {
        //  System.out.println(10 / 0);// max(int,int,int) int doesnot have infinity ERROR
            System.out.println(10 / 0.0); //max(int,double,int) double and float have infinity so NO ERROR : Infinity
            System.out.println(-10 / 0.0); // -infinity
       //   System.out.println(0 / 0); //undefined (type of int) there is nothing called undefined in int so ERROR
            System.out.println(0.0/0); // NAN (type of double ) double has nan so no ERROR 
    }
}
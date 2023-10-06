public class lowerupper {
public static void main(String[] args){
    String s=new String("hello"); // two obj 1 in heap 2 in scp
    String s1=s.toUpperCase(); // new obj
    String s3=s.toLowerCase(); //  s1 point to s only as same obj
    System.out.println(s1==s); // false
    System.out.println(s3 == s); // true because s3 does not make any changes in existing hello 
                                        //it is already in lowercase so no new object formation
                                        //if theere will be slight change might be there like 
                                        //instead of hello it would have been Hello then
                                        // ans will be FALSE
    String s4 = s1.toLowerCase(); // new object will be created becuz changes are applied in current object then it willl not see if this value is present or not it will make new object                                 
    System.out.println(s4==s); // false 
                                
}
}

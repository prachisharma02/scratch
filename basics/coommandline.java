public class coommandline {
 public static void main(String[] args) {
    int x;
    if(args.length>0){
        x=10; 
    }
    else
    x=20; // if theere is no else part then error cuz jvm will say there is no value of x

    System.out.println(x);
   
}
}

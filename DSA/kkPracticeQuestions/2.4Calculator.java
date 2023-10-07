import java.util.Scanner;
 class calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int result=0;
        System.out.println("Enter First number");
        int a= sc.nextInt();
        System.out.println("Enter Second Number ");
        int b=sc.nextInt();
         System.out.println("Enter Operator(+,-,/,*) ");
        String x=sc.next();
        if(x.equals("+")){
            result=a+b;
            System.out.println(result);
        }
        else  if(x.equals("-")){
            result=a-b;
            System.out.println(result);
        }
        else  if(x.equals("*")){
            result=a*b;
            System.out.println(result);
        }
        else  if(x.equals("/")){
            result=a/b;
            System.out.println(result);
        }
       
    }
}



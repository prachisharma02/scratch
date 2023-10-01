public class stringMethods {
    public static void main(String[] args) {
        String s = "Prachi";
    
        System.out.println(s.charAt(0)); //1st method
        System.out.println(s.concat("sharma")); //2nd method
        System.out.println(s + "sharma"); //same as 2nd only by operator 
        
        System.out.println(s.equals("PRACHI"));
        System.out.println(s.equalsIgnoreCase("PRACHI"));
    }
}

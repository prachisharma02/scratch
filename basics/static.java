 class staticvar {
     static int x = 10;
// ways to access static variable 
     public static void main(String[] args) {
         staticvar s = new staticvar();
         System.out.println(x);
         System.out.println(staticvar.x);
         System.out.println(s.x);
        
     }
}

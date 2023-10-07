public class psvm1 {
   // public static void main(String[] args) {
        //    AT runtime jvm always searches for main method with the public static void main prototype so
        //PUBLIC : to acess from anywhere
        //STATIC : object is not required
        //VOID   : idf this method returns something to jvm then jvm has nothing to do with that value so void 
        //MAIN   : cuz this name is configured in jvm 
        // (String[] args) : Command line arguments

        // And this syntax is most important if we make any small changes in this we get nosuchmethoderror: main
        // but some changes are acceceptable 

        // VALID SYNTAX

        // static public  void main(String[] args) { }
        // static public  void main(String[] args) { }
        // static public  void main(String []args) { }
        // static public  void main(String args[]) { }
        // static public  void main(String... args) { }
        // static public  void main(String[] prachi) { }
        public static strictfp final synchronized void main(String[] args) {
            System.out.println("valid main method");
    }
}

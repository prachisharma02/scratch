class constructor {
    public static void main(String[] args) {
        // DIFFERENT TYPE OF STRING CONSTRUCTOR

        String s1 = new String();

        String s2 = new String("hello");

        StringBuilder sb = new StringBuilder("s1");
        String s3 = new String(sb);
        
        StringBuffer sbb = new StringBuffer("str");
        String s4 = new String(sbb);
        
        char[] ch = { 'j', 'a', 'v', 'a' };
        String s5 = new String(ch);
        System.out.println(s5);

        byte[] ch1 = { 97, 98, 'v', 'a' }; // 97 and 98 will be converted into abc...
        String s6 = new String(ch1);
        System.out.println(s6 );
    }
}
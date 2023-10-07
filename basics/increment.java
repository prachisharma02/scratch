class increment {
    public static void main(String[] args) {
        final int x = 10;
        int y = 20;
        //   x++; // reassignment is not allowed to final variable
        y++;
        System.out.println(x); //10
        System.out.println(y); //21 
        System.out.println(y++); //21 but increment will happen
        ++y; //23
        System.out.println(y); //23
        System.out.println(++y); //24
        char ch = 'a';
        ch++;
        System.out.println(ch); //b
        double d = 20.5;
        d++;
        System.out.println(d); //21.5
        boolean b = true;
       // b++; //invalid cuz its non numeric
        System.out.println(b);
    }
    
}
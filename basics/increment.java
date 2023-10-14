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
        byte s = 127;
        // s = s + 1; // due to change from byte to int
        System.out.println(s);
        s += 1; // INTERNAL WORKING WILL BE S=(BYTE)S+1 convrerting from int as +1 is int type //-128
        s++; // increment in byte only it is just increasing the value not converting from int to byte so -127
        System.out.println(s);
    }
    
}
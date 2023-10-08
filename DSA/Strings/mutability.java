class abc {
    public static void main(String[] args) {
        String s = new String("hello");
        StringBuffer sb = new StringBuffer("hello");
        s.concat("prachi");
        sb.append("prachi");
        System.out.println(s); //hello
        System.out.println(sb); // helloprachi

    }
}
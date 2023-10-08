public class methodchaining {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello").append("prachi").append("sharma").reverse().insert(3, "t").deleteCharAt(7);
        System.out.println(sb);
        /*hello
         * helloprachi
         * helloprachisharma
         * amrahsihcarpolleh
         * amrtahshcarpolleh
         */

    }
    
}

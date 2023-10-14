public class precedence {
    public static  int main(int i) {
        System.out.println(i);
        return i;
    }
    public static void main(String[] args) {
        System.out.println(main(1)+main(2)*main(3)/main(4)+main(5)*main(6));
    }
}

//operator precence is there not operands so all the main function will be called then operator precedence
// wiil be applied so 
//output is 1
// 2
// 3
// 4
// 5
// 6
// 32
public class varargs2 {
    public static void var(int[]... arr) {
        for (int[] num : arr) {
            System.out.println(num[2]);
        }
    }
    public static void main(String[] args) {
         int[] a = { 10, 20, 30 };
    int[] b = { 30, 40, 50 };

    var(a,b);

    }
}

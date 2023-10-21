public class switchstatement {
    public static void main(String[] args) {

        int a = 10;
        final int b = 20; // making it final makes b constant then valid 
        switch (a) {
            case 10:
                System.out.println("hi");
            case b: // ERROR every case must be constant not a variable
                System.out.println("hwllo");
        }


        int x = 2;
        switch (x + 1) { 
            default: // within switch we can write default case anywhere
            case 10:          // these all are valid
            System.out.println(5);
            case 10+20+30:

        }
    }
}

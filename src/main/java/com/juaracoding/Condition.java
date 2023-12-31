public class Condition {
    public static void main(String[] args) {

        int x;
        //int y;

        for (x = 1; x <= 100; x++) {
            //System.out.println("BIZZ");
            if (x % 3 == 0 && x % 5 == 0) {
                //System.out.println("BUZZ");
                System.out.println("BIZZBUZZ");
            } else if (x % 3 == 0) {
                System.out.println("BIZZ");
            } else if (x % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(x);
            }
        }
    }
}

public class Prob17 {
    public static void main(String[] args) {
        int large = 6202;
        int small = 14;
        while (small > 0) {
            int temp = large % small;
            large = small;
            small = temp;
        }
        System.out.println("GCD of " + 6202 + " and " + 14 + " is " + large);
    }
}

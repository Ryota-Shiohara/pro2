public class Prob86 {
    public static void main(String args[]) {

        if (args.length < 2) {
            System.out.println("Please input TWO integers");
            return;
        }
        
        int a, b;
        try {
            a = Integer.valueOf(args[0]);
            b = Integer.valueOf(args[1]);
        } catch (Exception e) {
            System.out.println("Please input INTEGERs");
            return;
        }

        int result = b;

        for (; a > 1;) {
            a /= 2;
            b *= 2;
            if (a % 2 != 0) {
                result += b;
            }
        }

        System.out.println(args[0] + " * " + args[1] + " = " + result);
    }
}

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            String s = sc.next();

            long ans = 0; 

            long freeLEven = 0;
            long freeLOdd = 0;
            
            long freeREven = 0;
            long freeROdd = 0;

            int i = 0;
            while (i < n) {
                int left = i;
                int right = i;

                while (right + 1 < n && s.charAt(right) != s.charAt(right + 1)) {
                    right++;
                }

                boolean isFreeL = false;
                if (left > 0 && s.charAt(left) == '(') {
                    isFreeL = true;
                }
                if (right < n - 1 && s.charAt(right) == '(') {
                    isFreeL = true;
                }

                boolean isFreeR = false;
                if (left > 0 && s.charAt(left) == ')') {
                    isFreeR = true;
                }
                if (right < n - 1 && s.charAt(right) == ')') {
                    isFreeR = true;
                }

                long countL = 0;
                long countR = 0;
                
                int parityL = 0;
                int parityR = 0;

                for (int k = left; k <= right; k++) {
                    if (s.charAt(k) == '(') {
                        countL++;
                        parityL = k % 2;
                    } else {
                        countR++;
                        parityR = k % 2;
                    }
                }

                if (isFreeL) {
                    if (parityL == 0) {
                        freeLEven += countL;
                    } else {
                        freeLOdd += countL;
                    }
                }

                if (isFreeR) {
                    if (parityR == 0) {
                        freeREven += countR;
                    } else {
                        freeROdd += countR;
                    }
                }

                if (isFreeL == false || isFreeR == false) {
                    ans += countL * countR;
                }

                i = right + 1;
            }

            ans += (freeLEven * freeROdd);
            ans += (freeLOdd * freeREven);

            System.out.println(ans);
        }
        
        sc.close();
    }
}
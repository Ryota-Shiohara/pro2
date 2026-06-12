public class Prob85 {
    public static void main(String args[]) {
        
        String str = args[0];
        for (int i = 1; i < args.length; i++) {
            str += args[i];
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); 
            if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z')) {
                System.out.println("Incorrect input!");
                return; 
            }
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");

    }
}

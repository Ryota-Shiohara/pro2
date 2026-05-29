public class Caesar {
    public static void main(String[] args) {
        for (int i = 2; i < args.length; i++) {
            String word = args[i];
            for (int j = 0; j < word.length(); j++) {
                char ch = args[i].charAt(j);
                System.out.print(changeChar(args[0].equals("true"), Integer.parseInt(args[1]), ch));
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    private static char changeChar(boolean isCode, int k, char ch) {
        if (isCode) {
            return (char) ((ch - 'a' + k + 26) % 26 + 'a');
        } else {
            return (char) ((ch - 'a' - k + 26) % 26 + 'a');
        }
    }
}

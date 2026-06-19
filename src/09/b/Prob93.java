    import java.util.*;
    import java.io.*;
    import java.nio.charset.Charset;
    import java.nio.file.Files;
    import java.nio.file.Paths;

    public class Prob93 {
        public static void main(String args[]) {
            int lineAllSum = 0;
            int wordAllSum = 0;

            for (int i = 0; i < args.length; i++) {
                try {
                    List<String> allLines = Files.readAllLines(Paths.get(args[i]), Charset.defaultCharset());
                    int lineSum = allLines.size();
                    int wordSum = 0;

                    for (int j=0; j<lineSum; j++) {
                        wordSum += allLines.get(j).length();
                    }

                    System.out.println(lineSum + " " +  wordSum + " " + args[i]);

                    lineAllSum += lineSum;
                    wordAllSum += wordSum;
                } catch (IOException e) {
                    System.err.println("IOException " + e.toString());
                }
                            
            }
            System.out.println(lineAllSum + " " + wordAllSum + " total");

        }
    }

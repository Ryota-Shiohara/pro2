import java.util.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Prob92 {
    
    public static void main(String args[]) {
        try {
            List<String> allLines = Files.readAllLines(Paths.get("message.txt"), Charset.defaultCharset());
            BufferedWriter output = Files.newBufferedWriter(Paths.get("output92.txt"), Charset.defaultCharset());

            for (int i=0; i<allLines.size(); i++) {
                String[] words = allLines.get(i).split("\\s+");
                String outLine = "";

                if (!allLines.get(i).trim().isEmpty()) {
                    for (int j=0; j<words.length; j++) {
                        int length = words[j].length();
                        outLine += length + words[j];

                        if (j < words.length - 1) {
                            outLine += " ";
                        }
                    }
                }                          
              
                output.write(outLine);
                if (i<allLines.size() - 1) {
                    output.newLine();
                }
            }

            output.close();
        } catch (IOException e) {
            System.err.println("IOException " + e.toString());
        }

        
        

    }
    
}

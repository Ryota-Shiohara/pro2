import java.util.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Prob105 {
    public static void main(String[] args) {
        try {
            List<String> csv1 = Files.readAllLines(Paths.get("input1051.txt"), Charset.defaultCharset());
            List<String> csv2 = Files.readAllLines(Paths.get("input1052.txt"), Charset.defaultCharset());
            BufferedWriter output = Files.newBufferedWriter(Paths.get("output105.txt"), Charset.defaultCharset());

            int maxLines = Math.max(csv1.size(), csv2.size());

            for (int i = 0; i < maxLines; i++) {

                String s1 = (i < csv1.size()) ? csv1.get(i) : "";
                String s2 = (i < csv2.size()) ? csv2.get(i) : "";

                String[] line1 = s1.split(",", -1);
                String[] line2 = s2.split(",", -1);
                
                String outline = "";

                for (int j = 0; j < Math.max(line1.length, line2.length); j++) {
                    if (j != 0) {
                        outline += ",";
                    }
                    int val1 = 0;
                    if (j < line1.length && !line1[j].isEmpty()) {
                        val1 = Integer.parseInt(line1[j]); 
                    }

                    int val2 = 0;
                    if (j < line2.length && !line2[j].isEmpty()) {
                        val2 = Integer.parseInt(line2[j]);
                    }

                    outline += (val1 * val2);                 
                }

                output.write(outline);
                if (i<maxLines - 1) {
                    output.newLine();
                }
            }

            output.close();
        } catch (IOException e) {
            System.err.println("IOException " + e.toString());
        }
    }
}

import java.util.*;

class Prob91 {
	private int result = 0;

	private boolean needInstruction = true;

	private void processInput(String inString) {  
		String[] inputs = inString.split("\\s+");
		for (int i=0; i<inputs.length; i++) {
			if (inputs[i].compareTo("quit") == 0) {
				System.exit(0);
			} else if (inputs[i].compareTo("end") == 0) {
				System.out.println(result);
				result = 0;
				needInstruction = true;
			} else {
				result += Integer.valueOf(inputs[i]);
			}
			
		}

	}

	public static void main(String[] args) {
		Prob91 app = new Prob91();
		Scanner scan = new Scanner(System.in);
		while (true) {

			if (app.needInstruction) {
                System.out.println("Please input numbers:");
                app.needInstruction = false;
            }

			if (scan.hasNextLine()) {
                String str = scan.nextLine();
                app.processInput(str);
            } else {
                break;
            }
		}
		scan.close();
	}
}


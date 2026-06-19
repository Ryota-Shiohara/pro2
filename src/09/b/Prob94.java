import java.util.*;

public class Prob94 {
    private void processInput(String inString) {  
		String[] inputs = inString.split("\\s+");
        Stack<Integer> temp = new Stack<Integer>();
		for (int i=0; i<inputs.length; i++) {
			if (inputs[i].compareTo("quit") == 0) {
				System.exit(0);
			} else if (inputs[i].compareTo("+") == 0) {
                int a = temp.pop();
                int b = temp.pop();
                temp.push(a + b);
            } else if (inputs[i].compareTo("-") == 0) {
                int a = temp.pop();
                int b = temp.pop();
                temp.push(b - a);
            } else if (inputs[i].compareTo("*") == 0) {
                int a = temp.pop();
                int b = temp.pop();
                temp.push(a * b);
            } else if (inputs[i].compareTo("/") == 0) {
                int a = temp.pop();
                int b = temp.pop();
                temp.push(b / a);
            } else {
                temp.push(Integer.valueOf(inputs[i]));
            }
			
		}
		System.out.println(temp.pop());

	}

    public static void main(String args[]) {
        Prob94 app = new Prob94();
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.nextLine();
			app.processInput(str);
		}
    }   
}

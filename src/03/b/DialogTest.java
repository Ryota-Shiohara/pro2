public class DialogTest {
    public static void main(String[] args) { 
        String text = javax.swing.JOptionPane.showInputDialog(null); 
        switch (text) {
            case "1":
                text = "apple";
                break;
            case "2":
                text = "banana";
                break;
            case "3":
                text = "cherry";
                break;
            case "4":
                text = "durian";
                break;
            default:
        }
        System.out.println(text); 
    } 
}

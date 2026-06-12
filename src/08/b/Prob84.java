public class Prob84 {
    public static void main(String args[]) {
        try {
            Object[] intList = new Integer[5];
            intList[0] = 1;
            String yagami = "Yagami";
            intList[1] = yagami;
        }
        catch(ArrayStoreException e) {
            System.out.println("ArrayStoreException caught!");
        }
    }
}

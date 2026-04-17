public class Prob27 {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber();
        ComplexNumber b = new ComplexNumber();

        a.real = 20;
        a.imaginary = 26;

        b.real = 4;
        b.imaginary = 17;

        a.print();
        System.out.println("絶対値は" + a.abs());

        b.print();
        System.out.println("絶対値は" + b.abs());
    }
}

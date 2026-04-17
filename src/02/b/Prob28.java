public class Prob28 {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.move(200, 200);
        t.penDown();
        for (int i=10; i<100; i+=3) {
            t.go(i);
            t.rotate(90);
        }

    }
}

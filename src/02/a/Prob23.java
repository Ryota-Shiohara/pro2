public class Prob23 {
    public static void main(String[] args) {
        Turtle t1 = new Turtle();
        Turtle t2 = new Turtle();
        t1.move(100, 200);
        t2.move(200, 300);
        t1.penDown();
        t2.penDown();
        for (int i=0; i<4; i++) {
            t1.go(41);
            t1.rotate(45);
            t2.go(41);
            t2.rotate(90);
            t1.go(41);
            t1.rotate(45);
        }
    }
}

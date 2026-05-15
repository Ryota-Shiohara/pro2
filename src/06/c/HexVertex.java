public class HexVertex extends Vertex {
    void draw(Turtle turtle) {
        for (int i=0; i<6; i++) {
            turtle.penDown();
            turtle.go(10);
            turtle.rotate(60);
            turtle.penUp();
        }
    }
}

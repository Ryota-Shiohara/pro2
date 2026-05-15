public class CrossVertex extends Vertex {
    void draw(Turtle turtle) {
        for (int i=0; i<4; i++) {
            turtle.penDown();
            turtle.go(5);
            turtle.penUp();
            turtle.rotate(180);
            turtle.go(5);
            turtle.rotate(90);
        }
    }
}

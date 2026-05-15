public class RectVertex extends Vertex {
    void draw(Turtle turtle) {
        for (int i=0; i<4; i++) {
            turtle.penDown();
            turtle.go(10);
            turtle.rotate(90);
            turtle.penUp();
        }
    }
}

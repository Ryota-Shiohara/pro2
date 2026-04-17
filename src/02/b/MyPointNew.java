public class MyPointNew {
    int x, y;
    double getDistance() {
        return Math.sqrt(x*x + y*y);
    }

    void setPoint(int a, int b) {
        x = a;
        y = b;
    }

    void printCoord() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

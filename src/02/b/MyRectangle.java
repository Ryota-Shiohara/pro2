public class MyRectangle {
    MyPointNew point1;
    MyPointNew point2; 

    void setPoints(int aX, int aY, int bX, int bY) {
        point1 = new MyPointNew();
        point2 = new MyPointNew();
        point1.setPoint(aX, aY);
        point2.setPoint(bX, bY);
    } 
    int computeLength() {
        return Math.abs(point1.x - point2.x);
    } 
    int computeWidth() {
        return Math.abs(point1.y - point2.y);
    } 
    int computeArea() {
        return computeLength()*computeWidth();
    } 
    int computeCircumference() {
        return 2 * (computeLength() + computeWidth());
    }
}

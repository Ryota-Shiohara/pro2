public class Prob210 {
    public static void main(String[] args) {
        MyRectangle myRect = new MyRectangle();
        myRect.setPoints(20, 26, 4, 17);
        int area = myRect.computeArea();
        int circumference = myRect.computeCircumference();
        System.out.println("The area of the rectangle is " + area + ", and the circumference is " + circumference);
    }
}

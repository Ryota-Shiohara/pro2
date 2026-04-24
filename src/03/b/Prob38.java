public class Prob38 {
    public static void main(String[] args) {
        MyPoint38 p1 = new MyPoint38();
        MyPoint38 p2 = new MyPoint38();

        p1.setPoint(20, 26);
        p2.setPoint(4, 24);

        double distance = p1.getDistanceFrom(p2);
        System.out.println("The distance is " + distance);
    }
}

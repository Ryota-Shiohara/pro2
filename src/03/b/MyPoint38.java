public class MyPoint38 {
	private int x;
	private int y;

	void setPoint(int xpos, int ypos) {
		x = xpos;
		y = ypos;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	double getDistance() {
		return Math.sqrt(x * x + y * y);
	}

	double getDistanceFrom(MyPoint38 from) {
		int fromX = from.getX();
		int fromY = from.getY();

		return Math.sqrt((fromX-x)*(fromX-x) + (fromY-y)*(fromY-y));
	}
}

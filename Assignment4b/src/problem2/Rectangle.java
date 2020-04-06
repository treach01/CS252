package problem2;

public class Rectangle extends ClosedCurve {
	private final double width;
	private final double length;
	
	public Rectangle(double w, double l) {
		this.length = l;
		this.width = w;
	}
	
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}


	@Override
	double computeArea() {
		return width * length;
	}
	
	@Override
	public String toString() {
		return "Rectangle";
	}

}

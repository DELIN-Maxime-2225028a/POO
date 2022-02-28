package Ex1_2;

public class Circle {

	private double radius = 1.0;

	public Circle() {
		radius = 1.0;
	}

	public double getRadius() {
		return radius; 
	}

	public double getCircumference() {
		return 2*Math.PI*radius;
	}

	public double getArea() {
		return radius*radius*Math.PI;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + "]";
	}
}

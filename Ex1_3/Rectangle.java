package Ex1_3;

public class Rectangle {

	private float length;
	private float width;

	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}

	public Rectangle(float length, float width) {
		this.length=length;
		this.width=width;
	}
	
	public float getPerimeter() {
		return 2*length+2*width;
	}

	public float getArea() {
		return length*width;
	}
	
	public float getLength() {
		return this.length;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setLength(float newLength) {
		length = newLength;
	}
	
	public void setWidth(float newWidth) {
		width = newWidth;
	}
	
	public String toString() {
		return "Rectangle[length=" + length + ",width=" + width + "]";
	}
}

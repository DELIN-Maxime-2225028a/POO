package Ex5_1;

public class lineSub extends point {
	   // A line needs two points: begin and end.
	   // The begin point is inherited from its superclass Point.
	   // Private variables
	   private point end;               // Ending point
	   
	   // Constructors
	   public lineSub (int beginX, int beginY, int endX, int endY) {
	      super(beginX, beginY);             // construct the begin Point
	      this.end = new point(endX, endY);  // construct the end Point
	   }
	   public lineSub (point begin, point end) {  // caller to construct the Points
	      super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
	      this.end = end;
	   }
	   
	   // Public methods
	   // Inherits methods getX() and getY() from superclass Point
	   public String toString() {
		   return "Line : (" + getX() + ") (" + getY() + ")";
	   }
	   
	   public point getBegin() {
		   return super.getPoint();
	   }
	   public point getEnd() {
		   
		   return end;
	   }
	   public void setBegin(point begin) {
		    super.getX();
		    super.getY();
	   }
	   public void setEnd(point end) {
		   this.end = end;
	   }
	   
	   public int getBeginX() {
		   return super.getX();
	   }
	   public int getBeginY() {
		   return super.getY();
	   }
	   public int getEndX() {
		   return end.getX();
	   }
	   public int getEndY() {
		   return end.getY();
	   }
	   
	   public void setBeginX(point X) {
		   super.setX(getBeginX());
	   }
	   public void setBeginY(point Y) {
		   super.setY(getBeginY());
	   }
	   public void setBeginXY(point X, point Y) {
		   super.setXY(getBeginX(), getBeginY());
	   }
	   public void setEndX(point endX) {
		   this.end.setX(getEndX());
	   }
	   public void setEndY(point endY) {
		   this.end.setY(getEndY());
	   }
	   public void setEndXY(point endX, point endY) {
		   this.end.setXY(getEndX(), getEndY());
	   }
	   
	   public int getLength() {
		   return (int) Math.sqrt((this.end.getY() - getBeginY()) * (this.end.getY() - getBeginY()) + (this.end.getX() - getBeginX()) * (this.end.getX() - getBeginX()));
	   }       // Length of the line
	   public double getGradient() {
		   return Math.atan2 ((this.end.getY() - getBeginY()), (this.end.getX() - getBeginX()));
	   }  // Gradient in radians
	}

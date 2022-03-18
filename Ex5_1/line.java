package Ex5_1;

public class line {
	   // A line composes of two points (as instance variables)
	   private point begin;    // beginning point
	   private point end;      // ending point
	   
	   // Constructors
	   public line (point begin, point end) {  // caller to construct the Points
	      this.begin = begin;
	      this.end = end;
	   }
	   public line (int beginX, int beginY, int endX, int endY) {
	      begin = new point(beginX, beginY);   // construct the Points here
	      end = new point(endX, endY);
	   }
	   
	   // Public methods
	   public String toString() {
		   return "Line : (" + begin + ") (" + end + ")";
	   }
	   
	   public point getBegin() {
		   return begin;
	   }
	   public point getEnd() {
		   return end;
	   }
	   public void setBegin(point begin) {
		   this.begin = begin;
	   }
	   public void setEnd(point end) {
		   this.end = end;
	   }
	   
	   public int getBeginX() {
		   return this.begin.getX();
	   }
	   public int getBeginY() {
		   return this.begin.getY();
	   }
	   public int getEndX() {
		   return this.end.getX();
	   }
	   public int getEndY() {
		   return this.end.getY();
	   }
	   
	   public void setBeginX(point beginX) {
		   this.begin.setX(getBeginX());
	   }
	   public void setBeginY(point beginY) {
		   this.begin.setY(getBeginY());
	   }
	   public void setBeginXY(point beginX, point beginY) {
		   this.begin.setXY(getBeginX(), getBeginY());
	   }
	   public void setEndX(point endX) {
		   this.end.setX(getBeginX());
	   }
	   public void setEndY(point endY) {
		   this.end.setY(getBeginY());
	   }
	   public void setEndXY(point endX, point endY) {
		   this.end.setXY(getBeginX(), getBeginY());
	   }
	   
	   public int getLength() {
		   return (int) Math.sqrt((this.end.getY() - this.begin.getY()) * (this.end.getY() - this.begin.getY()) + (this.end.getX() - this.begin.getX()) * (this.end.getX() - this.begin.getX()));
	   } // Length of the line
	                                     // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
	   public double getGradient() {
		   return Math.atan2 ((this.end.getY() - this.begin.getY()), (this.end.getX() - this.begin.getX()));
	   } // Gradient in radians
	   	// Math.atan2(yDiff, xDiff)
	}

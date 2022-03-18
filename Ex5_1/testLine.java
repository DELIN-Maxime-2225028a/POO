package Ex5_1;

public class testLine {
	   public static void main(String[] args) {
	      line l1 = new line(0, 0, 3, 4);
	      System.out.println(l1);
	   
	      point p1 = new point(30,70);
	      point p2 = new point(10, 90);
	      line l2 = new line(p1, p2);
	      System.out.println(l2);
	      System.out.println(l2.getLength());
	      System.out.println(l1.getGradient());
	   }
	}

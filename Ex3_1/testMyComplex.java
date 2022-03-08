package Ex3_1;

public class testMyComplex {

	public static void main(String[] args) {
		
		myComplex c1 = new myComplex();
		System.out.println(c1.isImaginary());
		System.out.println(c1.isReal());
		System.out.println(c1);
		
		myComplex c2 =  new myComplex(1.5, 2.5);
		System.out.println(c2.getReal());
		System.out.println(c2.getImag());
		System.out.println(c2);
		c2.setImag(3.2);
		System.out.println(c2);
		c2.setValue(4.6, 3.76);
		System.out.println(c2);
		System.out.println(c2.equals(5.5, 3.5));
		System.out.println(c2.equals(4.6, 3.76));
		System.out.println(c2.equals(c1));
		System.out.println(c2.equals(c2));
		System.out.println(c2.magnitude());
		
		c1.setValue(1.5, 1.5);
		
		c2.addInto(c1);
		System.out.println(c2);
		
		myComplex c3 = c2.addNew(c1);
		System.out.println(c3);
	}

}

package Ex3_1;

import java.util.Scanner;

public class myComplexApp {

	public static void main(String[] args) {
		double real, imag;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter complex number 1 (real and imaginary part):");
		real = in.nextDouble();
		imag = in.nextDouble();
		
		myComplex c1 = new myComplex(real,imag);
		System.out.println("Enter complex number 2 (real and imaginary part):");
		real = in.nextDouble();
		imag = in.nextDouble();
		
		myComplex c2 = new myComplex(real,imag);
		
		in.close();
		
		System.out.println("Number 1 is:"+c1);
		System.out.println(c1.isReal() ? c1+" is a pure real number": c1+" is NOT a pure real number");
		System.out.println(c1.isImaginary() ? c1+" is a pure imaginary number": c1+" is NOT a pure imaginary number");
		
		System.out.println("Number 2 is:"+c2);
		System.out.println(c2.isReal() ? c2+" is a pure real number": c2+" is NOT a pure real number");
		System.out.println(c2.isImaginary() ? c2+" is a pure imaginary number": c2+" is NOT a pure imaginary number");
		
		System.out.println(c1.equals(c2) ? c1+" is equal to"+c2 : c1+" is NOT equal to"+c2);
		System.out.println(c1+" + "+c2+" = "+c1.addNew(c2));
	}

}

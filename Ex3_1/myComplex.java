package Ex3_1;

public class myComplex {
	private double real;
	private double imag;

	public myComplex() {
		
	}
	
	public myComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		return "Real : " + getReal() + ", Image : " + getImag() + ".";
	}
	
	public boolean isReal() {
		return imag == 0;
	}
	
	public boolean isImaginary() {
		return real == 0;
	}
	
	public boolean equals(double real, double imag) {
		return this.real == real && this.imag == imag;
	}
	
	public boolean equals(myComplex another ) {
		return another.getImag() == this.imag && another.getReal() == real;
	}
	
	public double magnitude() {
		return Math.sqrt(real*real + imag*imag);
	}
	
	public myComplex addInto(myComplex right) {
		this.real += right.getReal();
		this.imag += right.getImag();
		return this;
	}
	
	public myComplex addNew(myComplex right) {
		return new myComplex(this.real + right.getReal(), this.imag + right.getImag());
	}
	
	public double argument() {
		return Math.atan2(imag, real);
	}
	
	public myComplex add(myComplex right) {
		this.real += right.getReal();
		this.imag += right.getImag();
		return this;
	}
	
	public myComplex subtract(myComplex right) {
		this.real -= right.getReal();
		this.imag -= right.getImag();
		return this;
	}
	
	public myComplex multiply(myComplex right) {
		this.real = this.real * right.getReal() - this.imag * right.getImag();
		this.imag = this.real * right.getImag() + this.imag*right.getReal();
		return this;
	}
	
	public myComplex divide(myComplex right) {
		this.multiply(new myComplex(right.getReal(),-1*right.getImag()));
		this.real /= right.getReal() * right.getReal() + right.getImag() * right.getImag() ;
		this.imag /= right.getReal() * right.getReal() + right.getImag() * right.getImag() ;
		return this;
	}
	
	public myComplex subtractNew(myComplex right) {
		return new myComplex(this.real - right.getReal(), this.imag - right.getImag());
	}
	
	public myComplex conjugate() {
		this.imag *= -1;
		return this;
	}
}

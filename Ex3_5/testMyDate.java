package Ex3_5;

public class testMyDate {

	public static void main(String[] args) {
		myDate d1 = new myDate(2012, 2, 28);
		System.out.println(d1);             // Tuesday 28 Feb 2012
		System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
		System.out.println(d1.nextDay());   // Thursday 1 Mar 2012
		System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012
		System.out.println(d1.nextYear());  // Monday 1 Apr 2013

		myDate d2 = new myDate(2012, 1, 2);
		System.out.println(d2);                 // Monday 2 Jan 2012
		System.out.println(d2.previousDay());   // Sunday 1 Jan 2012
		System.out.println(d2.previousDay());   // Saturday 31 Dec 2011
		System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
		System.out.println(d2.previousYear());  // Tuesday 30 Nov 2010

		myDate d3 = new myDate(2012, 2, 29);
		System.out.println(d3.previousYear());  // Monday 28 Feb 2011

		// MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
		// MyDate d5 = new MyDate(2011, 2, 29);  // Invalid year, month, or day!
	}
}

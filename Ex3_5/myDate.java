package Ex3_5;

public class myDate {
	private int year;
	private int month;
	private int day;
	public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	public static final String[] DAYS = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
	public static final int[] DAY_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear(int year) {
		return (year%4 == 0);
	}
	
	public boolean isValidDate(int year, int month, int day) {
		if(year > 9999 || year < 1 || month > 12 || month < 1 || day > DAY_IN_MONTHS[this.month] || day < 1)
			return false;
		else
			return true;
	}
	
	public myDate(int year, int month, int day) {
		if(isValidDate(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		}
		else {
			this.year = 1;
			this.month = 1;
			this.day = 1;
		}
	}
	
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String toString() {
		return "myDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	public myDate nextDay() {
		if(day < DAY_IN_MONTHS[this.month]-1)
			++day;
		else {
			this.nextMonth();
			day = 0;
		}
		return this;
	}
	
	public myDate nextMonth() {
		if(month < 11)
			++month;
		else {
			this.nextYear();
			month = 1;
		}
		return this;
	}
	
	public myDate nextYear() {
		++year;
		return this;
	}
	
	public myDate previousDay() {
		if(day > 1)
			--day;
		else {
			this.previousMonth();
			day = DAY_IN_MONTHS[this.month];
		}
		return this;
	}
	
	public myDate previousMonth() {
		if(month > 1)
			--month;
		else {
			this.previousYear();
			month = 12;
		}
		return this;
	}
	
	public myDate previousYear() {
		--year;
		return this;
	}
}

package Ex3_4;

public class myTime {
	private int hour;
	private int minute;
	private int second;
	
	public myTime() {
		
	}
	
	public myTime(int hour, int minute, int second) {
		
	}
	
	public void setTime(int hour, int minute, int second) {
		
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public String toString() {
		return "myTime [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	
	public myTime nextSecond() {
		if(second < 59)
			++second;
		else {
			this.nextMinute();
			second = 0;
		}
		return this;
	}
	
	public myTime nextMinute() {
		if(minute < 59)
			++minute;
		else {
			this.nextHour();
			minute = 0;
		}
		return this;
	}
	
	public myTime nextHour() {
		if(hour < 23)
			++hour;
		else
			hour = 0;
		return this;
	}
	
	public myTime previousSecond() {
		if(second > 0)
			--second;
		else {
			this.previousMinute();
			second = 59;
		}
		return this;
	}
	
	public myTime previousMinute() {
		if(minute > 0)
			--minute;
		else {
			this.previousHour();
			minute = 59;
		}
		return this;
	}
	
	public myTime previousHour() {
		if(hour > 0)
			--hour;
		else
			hour = 23;
		return this;
	}
}

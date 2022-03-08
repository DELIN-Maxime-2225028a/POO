package Ex3_4;

public class testMyTime {
    public static void main(String[] args) {

        myTime time = new myTime();

        time.setHour(23);
        time.setMinute(46);
        time.setSecond(46);

        time.getHour();
        time.getMinute();
        time.getSecond();

        time.nextHour();
        time.nextMinute();
        time.nextSecond();

        System.out.println(time);

        myTime time2 = new myTime(0,0,0);

        time2.previousHour();
        time2.previousMinute();
        time2.previousSecond();

        time2.getHour();
        time2.getMinute();
        time2.getSecond();

        time2.setTime(12,30,5);

        System.out.println(time2);

    }
}

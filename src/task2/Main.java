package task2;

public class Main {
    public static void main(String[] args) {
        TimeSpan timeSpan1 = new TimeSpan(4,5,40);
        TimeSpan timeSpan2 = new TimeSpan(5,67,120);
        System.out.println("Time_1 = " + timeSpan1);
        System.out.println("Time_2 = " + timeSpan2);
        timeSpan1.add(timeSpan2);
        System.out.println("Time_1 + Time_2 = " + timeSpan1);
        timeSpan1.subtract(timeSpan2);
        System.out.println("Time_1 - Time_2 = " + timeSpan1);
    }
}

class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private void normTime() {
        if (second>=60) {
            minute += second/60;
            second = second%60;
        }
        if (minute>=60) {
            hour += minute/60;
            minute = minute%60;
        }
        if (hour < 0) {
            hour = 0;
            minute = 0;
            second = 0;
        }
        if (second < 0) {

        }
        if (minute < 0) {

        }
    }


    public void add(TimeSpan time) {
        this.hour += time.getHour();
        this.minute += time.getMinute();
        this.second = time.getSecond();
    }

    public void subtract(TimeSpan time) {
        this.hour -= time.getHour();
        this.minute -= time.getMinute();
        this.second -= time.getSecond();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "("+ hour + ", "+ minute +", "+ second+")";
    }
}

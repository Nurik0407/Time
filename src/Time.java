public class Time {

    private int hour;
    private int minute;
    private int second;


    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    @Override
    public String toString() {
        String strhour = "";
        String strminute = "";
        String strsecond = "";
        String result = null;

        if (hour >= 0 && hour <= 23) {
            if (minute >= 0 && minute <= 59) {
                if (second >= 0 && second <= 59) {
                    if (hour <= 9) {
                        strhour = "0";
                    }
                    if (minute <= 9) {
                        strminute = "0";
                    }
                    if (second <= 9) {
                        strsecond = "0";
                    }
                    result = strhour + hour + ":" + strminute + minute + ":" + strsecond + second;
                } else {
                    result = "Invalid number";
                }
            } else {
                result = "Invalid number";
            }
        } else {
            result = "Invalid number";
        }
        return result;
    }

    void nextSecond() {
        if (second == 59) {
            if (minute == 59) {
                if (hour == 23) {
                    hour = 0;
                } else hour++;
                minute = 0;
            } else minute++;
            second = 0;
        } else second++;
    }

    void previoussecond() {
        if (second == 0) {
            if (minute == 0) {
                if (hour == 0) {
                    hour = 23;
                } else hour--;
                minute = 59;
            } else minute--;
            second = 59;
        } else second--;
    }
}
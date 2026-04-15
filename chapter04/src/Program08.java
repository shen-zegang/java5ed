
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        super();
        long t = System.currentTimeMillis();
        long seconds = t / 1000;          // 总秒数
        second = (int) (seconds % 60);
        long minutes = seconds / 60;     // 总分钟数
        minute = (int) (minutes % 60);
        long hours = minutes / 60 + 8;        // 总小时数
        hour = (int) (hours % 24);
    }

    public Time(int hour, int mimute, int second) {
        super();
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    public boolean isBefore(com.boda.xy.Time time) {
        return true;
    }

    public boolean isAfter(com.boda.xy.Time time) {
        return true;
    }

    @Override
    public String toString() {
        return "" + hour + ":" + minute + ":" + second + "";
    }
}

void main() {
    Time now = new Time();
    System.err.println(now);
}

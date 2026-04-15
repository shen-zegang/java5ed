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
    public Time(int hour, int minute, int second) {
        super();
        if (hour < 0 || hour > 24 || minute < 0 || minute > 60
                || second < 0 || second > 60) {
            // 下面语句是抛出一个运行时异常
            throw new RuntimeException("时间不合法！");
        }
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
    public boolean isBefore(Time time) {
        if (hour < time.getHour()) {
            return true;
        } else if (hour == time.getHour()) {   // 若小时相等还需判断分钟
            if (minute < time.getMinute()) {
                return true;
            } else if (minute == time.getMinute()) {
                if (second < time.getSecond()) {  // 若分钟相等还需判断秒
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public boolean isAfter(Time time) {
        if (hour > time.getHour()) {
            return true;
        } else if (hour == time.getHour()) {
            if (minute > time.getMinute()) {
                return true;
            } else if (minute == time.getMinute()) {
                if (second > time.getSecond()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "" + hour + ":" + minute + ":" + second + "";
    }
}
void main() {
    Time now = new Time();
    Time now2 = new Time(21, 10, 23);
    IO.println(now);
    IO.println(now2);
    IO.println(now.isBefore(now2));
    IO.println(now.isAfter(now2));
}


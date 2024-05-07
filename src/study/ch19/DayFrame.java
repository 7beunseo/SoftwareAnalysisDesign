package study.ch19;

public class DayFrame implements State{
    private static DayFrame dayFrame = new DayFrame();
    private DayFrame() {}
    public static DayFrame getInstance() {
        return dayFrame;
    }
    @Override
    public void doClock(Context context, int hour) {
        if(hour < 9 || hour >= 17)
            context.changeState(NightState.getInstance());
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고 사용[주간");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(주간)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반 통화(주간)");
    }

    @Override
    public String toString() {
        return "[주간]";
    }
}

package study.ch190;

public class DayState implements State{
    // 싱글톤 패턴 적용
    private static DayState dayState = new DayState();
    private DayState() {}

    public static DayState getInstance() {
        return dayState;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(hour < 9 || hour > 17) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고사용 [주간]");
    }

    @Override
    public void doAlerm(Context context) {
        context.callSecurityCenter("비상벨 [주간]");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반 통화 [주간]");
    }

    @Override
    public String toString() {
        return "[주간]";
    }
}

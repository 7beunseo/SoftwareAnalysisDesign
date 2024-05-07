package study.ch19;

import jdk.jfr.StackTrace;

public class NightState implements State{
    private static NightState nightState = new NightState();
    private NightState() {}
    public static NightState getInstance() {
        return nightState;
    }
    @Override
    public void doClock(Context context, int hour) {
        if(hour >= 9 && hour < 17) {
            context.changeState(DayFrame.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("비상! 야간 금고 사용");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨 (야간)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("야간 통화 녹음");
    }

    @Override
    public String toString() {
        return "[야간]";
    }
}

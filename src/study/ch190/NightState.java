package study.ch190;

public class NightState implements State{
    private static NightState nightState = new NightState();
    private NightState() {}

    public static NightState getInstance() {
        return nightState;
    }

    @Override
    public void doClock(Context context, int time) {
        if (time >= 9 && time <= 17){
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("비상 ! : 금고 사용 [야간]");
    }

    @Override
    public void doAlerm(Context context) {
        context.callSecurityCenter("비상벨 [야간]");
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

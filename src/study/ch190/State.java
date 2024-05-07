package study.ch190;

public interface State {
    void doClock(Context context, int time);
    void doUse(Context context);
    void doAlerm(Context context);
    void doPhone(Context context);
}

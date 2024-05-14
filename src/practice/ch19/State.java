package practice.ch19;

public interface State {
    void doClock(Context context, int hour);
    void doUse(Context context);
}

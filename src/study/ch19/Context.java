package study.ch19;

public interface Context {
    void setClock(int hour);
    void changeState(State state);
    void callSecurityCenter(String msg);
    void recordLog(String string);
}

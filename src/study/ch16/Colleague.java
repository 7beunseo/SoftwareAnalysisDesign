package study.ch16;

public interface Colleague {
    // Mediator를 설정함
    public abstract void setMediator(Mediator mediator);
    // Mediator에서 활성, 비활성을 지시함
    void setColleagueEnabled(boolean enabled);
}

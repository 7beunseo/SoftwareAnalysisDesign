package study.ch16;

public interface Mediator {
    // colleagues 를 생성함
    void createColleagues();
    // colleague가 변경되었을 때 호출함
    void colleagueChanged();
}

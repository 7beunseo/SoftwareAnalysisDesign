package hw.ch11;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    // 김은서 : 하위 파일(자신 포함)들의 개수를 세는 getCount() 메서드 추가
    public abstract int getCount();
    // 김은서 : getDate(), getAuthor() 메서드 추가
    public abstract String getDate();
    public abstract String getAuthor();
    public void printList() {
        printList("");
    }

    public abstract void printList(String prefix);

    // 김은서 : 날짜, 개수 모두 출력될 수 있도록 toString() 수정
    @Override
    public String toString() {
        return getName() + "(" + getSize() + ") [" + getDate() + "] [" + getCount() + "개][" + getAuthor() + "]";
    }

}

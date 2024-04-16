package study.ch11;

public abstract class Entry {
    public abstract String getName(); // 이름을 얻음

    public abstract int getSize(); // 크기를 얻음

    // 인자 없이 printList를 호출할 경우
    public void printList() {
        printList(""); // 인자 있는 printlist에 빈 문자열을 매개변수로 전달함
    }

    public abstract void printList(String prefix); // prefix를 앞에 붙여 목록을 표시함

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")"; // 자신의 이름과 사이즈 출력
    }

    /**
     * 하위 클래스의 인스턴스로부터 전체 경로를 얻는 기능 추가하기
     */
    private Entry parent;

    protected void setParent(Entry parent) {
        this.parent = parent;
    }

    // 전체 경로를 가져옴
    public String getFullName() {
        StringBuilder fullname = new StringBuilder();
        Entry entry = this;
        do {
            fullname.insert(0, entry.getName());
            fullname.insert(0, "/");
            entry = entry.parent;
        } while(entry != null);
        return fullname.toString();
    }
}

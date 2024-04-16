package study.ch11;

public class File extends Entry{
    private String name; // 파일의 이름을 다음
    private int size; // 파일의 사이즐르 담음

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void printList(String prefix) { // prefix : 현재 경로를 알려주는 역할
        // 더이상 들어갈 곳이 없으므로 출력만 하고 재귀 호출은 없음
        System.out.println(prefix + "/" + this); // this는 자기 자신을 호출 (Entry의 toString())
    }
}

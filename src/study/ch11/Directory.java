package study.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry{
    private String name; // 디렉토리의 이름
    private List<Entry> directory = new ArrayList<>(); // 디렉토리가 가지고 있는 Entry (디렉터리일수도,, 파일일수도,, )


    Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for(Entry entry : directory) {
            size += entry.getSize(); // 보유하고 있는 Entry들의 getSize()를 호출하여 재귀적으로 size 값을 얻어옴
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this); // 맨 처음은 자기 자신 호출

        for(Entry entry : directory) {
            entry.printList(prefix + "/" + name); // "현재경로/자신의경로" 를 받아 하위 디렉토리와 파일도 자신의 경로를 출력하도록
        }
    }

    public Entry add(Entry entry) {
        directory.add(entry); // 현재 디렉토리 모음집에 매개변수로 들어온 entry 넣음
        entry.setParent(this); // 자식에게 부모 정보 넣어줌
        return this;
    }
}

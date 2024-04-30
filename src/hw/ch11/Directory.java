package hw.ch11;


import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();
    // 김은서 : date, author 속성 추가
    private String date;
    private String author;

    public Directory(String name, String date, String author) {
        this.name = name;
        this.date = date;
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for(Entry e : directory) {
            size += e.getSize();
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for(Entry e: directory) {
            e.printList(prefix + "/" + name);
        }
    }

    // 김은서 : 디렉터리의 경우 재귀적으로 하위 파일, 폴더의 getCount()를 호출하여 하위 파일들의 개수를 셈
    @Override
    public int getCount() {
        int count = 0;
        for(Entry e : directory) {
            count += e.getCount();
        }
        return count;
    }

    // 김은서 : getDate(), getAuthor() 오버라이딩
    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    public void add(Entry entry) {
        directory.add(entry);
    }
}

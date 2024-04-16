package hw.ch11;


import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
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

    public void add(Entry entry) {
        directory.add(entry);
    }
}
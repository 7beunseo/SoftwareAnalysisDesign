package hw.ch11;

public class Main {
    public static void main(String[] args) {
        Entry f1 = new File("a.txt", 100);
        Entry f2 = new File("a.txt", 200);

        Entry dir1 = new Directory("bin");

        ((Directory) dir1).add(f1);
        ((Directory) dir1).add(f2);

        dir1.printList();

        Directory root = new Directory("root");
        root.add(dir1); // root 밑에 bin
        root.add(new File("root.txt", 300));

        root.printList();
        System.out.println(root.getSize());
    }
}

package study.ch11;

public class Main {
    public static void main(String[] args) {
        // 모두 Entry로 선언할 수도 있음
        // Entry로 선언할 경우 디렉터리의 add 메서드 호출 시 다운캐스팅 필요
        File f1 = new File("a.txt", 100);
        System.out.println(f1.getName());
        System.out.println(f1.getSize());

        f1.printList();
        f1.printList("C:/docs");

        System.out.println(f1);

        File f2 = new File("b.txt", 200);

        Directory d1 = new Directory("bin");
        d1.add(f1);
        d1.add(f2);
        d1.printList();

        Directory root = new Directory("root");
        root.add(d1);
        root.add(new File("root.txt", 300));

        root.printList();
        System.out.println(root.getSize());

        // fullname 출력
        System.out.println(f2.getFullName());
        System.out.println(d1.getFullName());
    }
}

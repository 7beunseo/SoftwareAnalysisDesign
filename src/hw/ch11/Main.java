package hw.ch11;

public class Main {
    public static void main(String[] args) {
        System.out.println("20220961 김은서");

        // 김은서 : 폴더, 파일 생성
        Directory MyDocuments = new Directory("MyDocuments", "20240101", "EunseoKim");
        Directory MyData = new Directory("MyData", "20240101", "EunseoKim");
        Directory MyPictures = new Directory("MyPictures", "20240101", "EunseoKim");
        File file1 = new File("김은서0.doc", "20240501", 1000, "EunseoKim");
        File file2 = new File("김은서1.doc", "20240501", 2000, "EunseoKim");
        File file3 = new File("김은서2.java", "20240501", 3000, "EunseoKim");
        File file4 = new File("김은서3.gif", "20240601", 4000, "EunseoKim");
        File file5 = new File("김은서4.jpg", "20240601", 5000, "EunseoKim");
        File file6 = new File("김은서5.png", "20240601", 6000, "EunseoKim");

        // 김은서 : 트리 구조 설정
        MyPictures.add(file4);
        MyPictures.add(file5);
        MyPictures.add(file6);

        MyData.add(file2);
        MyData.add(file3);
        MyData.add(MyPictures);

        MyDocuments.add(file1);
        MyDocuments.add(MyData);

        MyDocuments.printList();
    }
}

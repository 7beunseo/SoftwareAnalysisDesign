package hw.ch11;


public class File extends Entry {
    private String name;
    private int size;
    // 김은서 : date, author 속성 추가
    private String date;
    private String author;

    public File(String name, String date, int size, String author) { // 김은서 : 추가한 속성 생성자에서 초기화
        this.name = name;
        this.size = size;
        this.date = date;
        this.author = author;
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
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    // 김은서 : 파일의 경우 1을 리턴하도록 설정
    @Override
    public int getCount() {
        return 1;
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


}

package study.ch20;

public class BigString {
    private BigChar[] bigChars;

    // 생성자
    public BigString(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigChars = new BigChar[string.length()];
        for(int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }

    }

    // 표시
    public void print() {
        for(BigChar bc : bigChars) {
            bc.print();
        }
    }
}

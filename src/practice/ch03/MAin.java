package practice.ch03;

public class Main {
    public static void main(String[] args) {
        //CharDisplay d1 = new CharDisplay('H'); //'H' char, "H" String
        AbstractDisplay d1 = new CharDisplay('H');
        d1.display();

        // StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        d2.display();

        // AbstractDisplay d3 = new AbstractDisplay();
        // 추상 클래스는 인스턴스를 생성할 수 없다.
    }
}

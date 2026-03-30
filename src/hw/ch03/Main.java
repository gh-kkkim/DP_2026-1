package hw.ch03;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20240964 이름: 김가현");

        AbstractDisplay d1 = new CharDisplay('H'); // 기본 5회
        AbstractDisplay d2 = new StringDisplay("Hello"); // 기본 5 회
        d1.display();
        d2.display();

        System.out.println();

        AbstractDisplay d3 = new CharDisplay('X', 3); // 3 회
        AbstractDisplay d4 = new StringDisplay("Test", 7); // 7 회
        d3.display();
        d4.display();

        System.out.println();

        AbstractDisplay num = new NumberDisplay(42, 4);
        num.display();
    }
}

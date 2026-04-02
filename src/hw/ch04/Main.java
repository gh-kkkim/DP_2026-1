package hw.ch04;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory("2026-03-20");
        Product card1 = factory.create("Kim Youngjin");
        Product card2 = factory.create("Son Heungmin");
        card1.use();
        card2.use();
    }
}

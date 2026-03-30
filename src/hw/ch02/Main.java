package hw.ch02;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20240964 이름: 김가현");

        KoreanOutlet koreanOutlet = new KoreanOutlet();
        Charger adapter = new KoreanOutletAdapter(koreanOutlet);
        Smartphone smartphone = new Smartphone(adapter);
        smartphone.charge();
    }
}

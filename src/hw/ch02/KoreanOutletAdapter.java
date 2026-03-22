package hw.ch02;

public class KoreanOutletAdapter implements Charger {
    private KoreanOutlet koreanOutlet;

    public KoreanOutletAdapter(KoreanOutlet koreanOutlet) {
        this.koreanOutlet = koreanOutlet;
    }

    @Override
    public int charge() {
        int voltage = koreanOutlet.provide();
        System.out.println("어댑터가 " + voltage + "V를 5V로 변환합니다.");
        return 5;
    }
}

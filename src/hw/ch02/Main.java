package hw.ch02;

public class Main {
    public static void main(String[] args) {
        // 1. 한국 콘센트 생성 (220V)
        KoreanOutlet koreanOutlet = new KoreanOutlet();
        
        // 2. 어댑터 생성 (KoreanOutlet을 Charger 인터페이스로 변환)
        KoreanOutletAdapter adapter = new KoreanOutletAdapter(koreanOutlet);
        
        // 3. 스마트폰 생성 (어댑터 전달)
        Smartphone smartphone = new Smartphone(adapter);
        
        // 4. 충전 시작
        smartphone.charge();
    }
}

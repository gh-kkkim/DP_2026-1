package practice.ch17;

public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) { // 통지 받을 때 호출디는 메소드
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(1000); // 0.1초 대기
        } catch (InterruptedException e) {
        }
    }
}

package practice.ch02.delegation;

// 어댑터
// 자바에서는 다중 상속이 불가능함(부모가 둘 이상은 허용이 안됨)
public class PrintAdapter02 extends Print {
    private Banner banner; // Banner 클래스의 인스턴스를 참조하는 필드

    public PrintAdapter02(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen(); // Banner 클래스의 메서드를 호출하여 구현(위임)
    }

    @Override
    public void printStrong() {
        banner.showWithAster(); // Banner 클래스의 메서드를 호출하여 구현(위임)
    }
    
    public String getYourName() {
        return "홍길동"; // 자신의 이름을 반환하는 메서드
    }
}

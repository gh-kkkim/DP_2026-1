package practice.ch05;

// 싱글톤 패턴 적용하기
public class Singleton {
    // (3) Singleton 객체를 미리 하나 만들어 둠
    private static Singleton singleton = new Singleton();
    // 클래스가 로딩될 때 Singleton 객체가 하나 만들어짐

    // (1) 생성자를 private으로 함
    private Singleton() {
        System.out.println("Singleton 객체가 생성됨");
    }

    // (2) Singleton 객체를 얻어갈 수 있는 메소드를 정의함
    public static Singleton getInstance() { 
        // static이 없으면 객체를 생성해야 호출할 수 있기 때문에
        // 객체를 만들지 않아도 호출할 수 있도록 static으로 선언함
        return singleton;
    }
}

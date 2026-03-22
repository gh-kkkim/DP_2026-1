package practice.ch02.delegation;

public class Main {
    public static void main(String[] args) {
        Print print = new PrintAdapter02("Hello");
        print.printWeak(); // (Hello)
        print.printStrong(); // *Hello*
        System.out.println(((PrintAdapter02) print).getYourName()); // 형 변환(타입캐스팅)
    }
}

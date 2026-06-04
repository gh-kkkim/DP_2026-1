package practice.ch21;

public class Main {
    public static void main(String[] args) {
        // 본인 생성
        //Printable p = new Printer("Alice");
        //p.print("Hello, world!");

        // 프록시를생성해서 이용
        Printable p2 = new PrinterProxy();
        System.out.println("이름은 현재 " + p2.getPrinterName() + "입니다.");
        p2.setPrinterName("Bob");
        System.out.println("이름은 현재 " + p2.getPrinterName() + "입니다.");
        p2.print("Hello, world."); // 본인이 생성
    }
}

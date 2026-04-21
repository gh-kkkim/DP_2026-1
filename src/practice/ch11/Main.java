package practice.ch11;

public class Main {
    public static void main(String[] args) {
        // 디렉토리 트리를 만든다
        // Directory root = new Directory("root");

        Entry root = new Directory("root"); // 업캐스닝은 자동으로 일어난다.

        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        ((Directory)root).add(bin);
        // 다운캐스팅
        // . 연산자가 타입캐스팅 연산자보다 우선순위가 높다.
        ((Directory)root).add(tmp);
        ((Directory)root).add(usr);

        // 파일 생성 및 추가
        bin.add(new File("vi", 10000));
        bin.add(new File("latex", 20000));
        
        // 디렉토리 리스트 출력
        root.printList();
    }
}
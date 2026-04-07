package practice.ch06.framework;

import java.util.HashMap;
import java.util.Map;

// Product를 등록해두고 필요할 때마다 복제해서 사용하는 클래스
public class Manager {
    // Product: 부모 타입
    private Map<String,Product> showcase = new HashMap<>();
    // (key, value) = (제품 이름, 제품)

    public void register(String name, Product prototype) {
        showcase.put(name, prototype); // (key, value) = (제품 이름, 제품)
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName); //(key)에 해당하는 (value)를 가져옴
        return p.createCopy(); // 복제해서 반환
    }
}

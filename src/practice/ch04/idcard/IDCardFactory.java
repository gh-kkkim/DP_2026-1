package practice.ch04.idcard;

import practice.ch04.framework.Factory;
import practice.ch04.framework.Product;
import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    int serial = 100; // 카드 번호
    private Map<String, IDCard> owners = new HashMap<>(); // 소유자 이름과 카드 객체를 저장하는 맵
    
    @Override
    // 부모 타입은 자식 객체를 참조할 수 있다. (다형성)
    // 부모 객체는 자식 타입이 참조할 수 없다. (다형성)
    protected Product createProduct(String owner) { // 실제 제품 생성
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) { // 제품 등록
        System.out.println(product + "을 등록했습니다.");
    }
}

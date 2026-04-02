package hw.ch04.idcard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class IDCardFactory extends Factory {
    private int serial = 100;

    IDCardFactory(String baseDate) {
        this.issuedDate = baseDate;
    }

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++, issuedDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}

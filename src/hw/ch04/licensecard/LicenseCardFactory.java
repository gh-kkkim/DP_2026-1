package hw.ch04.licensecard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCount = 100;
    private String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    protected synchronized Product createProduct(String holder){
        return new LicenseCard(holder, licenseCount++, baseDate, "2030-12-31");
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}

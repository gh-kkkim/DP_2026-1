package hw.ch17;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberGenerator extends NumberGenerator {
    private int number;	    // 짝수여야 한다
    private int end;		// 이 값은 포함하지 않는다

    public EvenNumberGenerator(int start, int end) {
        this.number = start;
        this.end = end;
    }

    // 수를 취득한다 
    @Override
    public int getNumber() {
        return number;
    }

    // 수를 생성한다 
    @Override
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += 2;
        }
    }
}

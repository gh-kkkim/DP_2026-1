package hw.ch17;

public class RangeObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        int value = generator.getNumber();

        String label;

        if (value < 10) {
            label = "Low";
        } else if (value < 20) {
            label = "Mid";
        } else {
            label = "High";
        }

        System.out.println("RangeObserver: [" + label + "] " + value);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}

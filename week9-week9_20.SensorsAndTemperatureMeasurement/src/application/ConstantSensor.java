package application;

public class ConstantSensor implements Sensor {

    private int measure;

    public ConstantSensor(int measureAtStart) {
        this.measure = measureAtStart;
    }

    @Override
    public boolean isOn() {
            return true;
    }

    @Override
    public void on() {
        // do nothing
    }

    @Override
    public void off() {
        // do nothing
    }

    @Override
    public int measure() {
        return this.measure;
    }
}

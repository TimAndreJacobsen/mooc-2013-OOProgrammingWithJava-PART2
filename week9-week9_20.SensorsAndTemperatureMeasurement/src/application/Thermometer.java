package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private boolean isOn;












    @Override
    public boolean isOn() {
        if (this.isOn) {
            return true;
        }
        return false;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (isOn) {
            Random random = new Random();
            return random.nextInt(60) - 30;
        }
        throw new IllegalArgumentException("measure() threw");
    }
}

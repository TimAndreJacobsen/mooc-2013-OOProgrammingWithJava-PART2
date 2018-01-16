package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Integer> readings = new ArrayList<Integer>();
    private List<Sensor> averageOfSensors = new ArrayList<Sensor>();


    public List<Integer> readings() {
        return readings;
    }


    public void addSensor(Sensor additional) {
        this.averageOfSensors.add(additional);
    }


    @Override
    public boolean isOn() {
        boolean isOn = true;
        for (Sensor s : averageOfSensors) {
            if (!s.isOn()) {
                isOn = false;
            }
        }
        return isOn;
    }

    @Override
    public void on() {
        for (Sensor s : averageOfSensors) {
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s : averageOfSensors) {
            s.off();
        }
    }

    @Override
    public int measure() {
        double avg = 0.0;
        for (Sensor averageOfSensor : averageOfSensors) {
            avg += averageOfSensor.measure();
        }
        avg /= averageOfSensors.size();
        this.readings.add((int)avg);
        return (int)avg;
    }
}

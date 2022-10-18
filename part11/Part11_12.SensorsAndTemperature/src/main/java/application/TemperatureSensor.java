package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean switchIs;
    private int count;
//    private List<Integer> readValue;

    public TemperatureSensor() {
        this.switchIs = false;
        this.count = 0;
//        this.readValue = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        return this.switchIs;
    }

    @Override
    public void setOn() {
        this.switchIs = true;
    }

    @Override
    public void setOff() {
        this.switchIs = false;
    }

    @Override
    public int read() {
        if (this.switchIs) {
            this.count++;
            Random random = new Random();
            int a = random.nextInt(30 - (-30)) + (-30);
//            this.readValue.add(a);
            return a;
        } else {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public int getCount() {
        return this.count;
    }

}

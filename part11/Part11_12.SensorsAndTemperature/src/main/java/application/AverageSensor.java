package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> list;
    //    private boolean switchIs;
//    private int count;
    private List<Integer> readValue;

    public AverageSensor() {
        this.list = new ArrayList<>();
//        this.switchIs = true;
//        this.count =0;
        readValue = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        if (this.list.stream().filter(x -> (x.isOn() == false)).findAny().isPresent()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void setOn() {
        this.list.stream().forEach(x -> x.setOn());
    }

    @Override
    public void setOff() {
        this.list.stream().forEach(x -> x.setOff());
    }

    @Override
    public int read() {
        if (isOn()) {
            readValue.add((int) this.list.stream().mapToInt(x -> x.read()).average().getAsDouble());
            return (int) this.list.stream().mapToInt(x -> x.read()).average().getAsDouble();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int getCount() {
        return 0;
    }

    public void addSensor(Sensor toAdd) {
        this.list.add(toAdd);
    }

    public List<Integer> readings() {
        if (this.list.stream().filter(x -> x.getCount() > 0).findAny().isPresent()) {
            return this.list.stream().map(x -> x.read()).collect(Collectors.toList());

        } else if (this.readValue.size() > 0) {
            return this.readValue;
        }
        return new ArrayList<>();
    }
}

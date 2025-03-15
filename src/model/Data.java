package model;

public class Data {
    private Sensor sensor;
    private double value;

    public Data(Sensor sensor, double value) {
        this.sensor = sensor;
        this.value = value;
    }

    public Sensor getSensor() {
        return sensor;
    }
    public void setSensor(Sensor sesnsor) {
        this.sensor = sensor;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f %s", sensor.getSensorType(), value, sensor.getTypeUnit());
    }
}

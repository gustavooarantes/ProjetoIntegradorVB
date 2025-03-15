package model;

public class Sensor {
    private String sensorType;
    private String typeUnit;

    public Sensor (String sensorType, String typeUnit) {
        this.sensorType = sensorType;
        this.typeUnit = typeUnit;
    }

    public String getSensorType() {
        return sensorType;
    }
    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getTypeUnit() {
        return typeUnit;
    }

    public void setTypeUnit(String typeUnit) {
        this.typeUnit = typeUnit;
    }

    @Override
    public String toString() {
        return String.format("Sensor [Tipo: %s, Unidade: %s]", sensorType, typeUnit);
    }
}

package processing;

import model.Data;

public class DataProcessing {
    public static void process(Data data) {
        // Data processing logic
        // Defines different triggers to alert the user
        switch (data.getSensor().getSensorType()) {
            case "Temperatura" -> checkTemperature(data);
            case "Umidade" -> checkHumidity(data);
            case "Luminosidade" -> checkLuminosity(data);
        }
    }

    public static void checkTemperature(Data data) {
        if (data.getValue() > 30) {
            System.out.println("Alerta: temperatura alta: " + data.getValue() + " °C");
        } else if (data.getValue() < 15) {
            System.out.println("Alerta: temperatura baixa: " + data.getValue() + " °C");
        } else {
            System.out.println("Temperatura normal: " + data.getValue() + " °C.");
        }
    }

    public static void checkHumidity(Data data) {
        if (data.getValue() > 80) {
            System.out.println("Alerta: umidade alta: " + data.getValue() + " %");
        } else if (data.getValue() < 30) {
            System.out.println("Alerta: umidade baixa: " + data.getValue() + " %");
        } else {
            System.out.println("Umidade normal: " + data.getValue() + " %");
        }
    }

    public static void checkLuminosity(Data data) {
        if (data.getValue() > 1000) {
            System.out.println("Alerta: luminosidade alta: " + data.getValue() + " lux");
        } else if (data.getValue() < 200) {
            System.out.println("Alerta: luminosidade baixa: " + data.getValue() + " lux");
        } else {
            System.out.println("Luminosidade normal: " + data.getValue() + " lux");
        }
    }
}

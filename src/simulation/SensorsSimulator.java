package simulation;

import model.Data;
import model.Sensor;

import java.util.Random;

public class SensorsSimulator {
    private static final Random random = new Random();

    public static Data generateData() {
        // Creating sensors (with unit values)
        Sensor sensorsTemperature = new Sensor("Temperatura", "°C");
        Sensor sensorsHumidity = new Sensor("Umidade", "%");
        Sensor sensorsLuminosity = new Sensor("Luminosidade", "lux");

        // Gets the generated data
        double temperature = generateTemperature();
        double humidity = generateHumidity();
        double luminosity = generateLuminosity();

        // Picking a random sensor's type
        int sensorsChoice = random.nextInt(3);

        return switch (sensorsChoice) {
            case 0 -> new Data(sensorsTemperature, temperature);
            case 1 -> new Data(sensorsHumidity, humidity);
            case 2 -> new Data(sensorsLuminosity, luminosity);
            default -> null;
        };
    }

    // Generates random data for each sensor's type
    private static double generateTemperature() {
        return 10 + random.nextDouble() * (40 - 10);
    }
    private static double generateHumidity() {
        return 10 + random.nextDouble() * (90 - 10);
    }
    private static double generateLuminosity() {
        return 50 + random.nextDouble() * (2000 - 50);
    }
}

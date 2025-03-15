package application;

import model.Data;
import processing.DataProcessing;
import simulation.SensorsSimulator;

public class App {
    public static void main(String[] args) {
        // Executing the simulation
        for (int i = 0; i < 5; i++) { // Simulates 5 scenarios
            Data data = SensorsSimulator.generateData();
            System.out.println(data);
            DataProcessing.process(data);
            System.out.println("----------------------------");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

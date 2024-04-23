package com.mycompany.app;

import java.util.Random;

public class App {
    public static double estimatePI(int k, double radius) {
        double success = 0, total = 0;
        Random random = new Random();

        for (int i = 0; i < k; i++) {

            double x = random.nextDouble() * radius;
            double y = random.nextDouble() * radius;

            if (x * x + y * y <= radius * radius) {
                success++;
            }
            total++;
        }
        return 4 * success / total;
    }
}

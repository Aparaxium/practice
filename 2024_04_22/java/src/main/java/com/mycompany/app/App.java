package com.mycompany.app;

import java.util.Random;

public class App {
    public static double estimatePI(int k, double radius) {
        double success = 0, total = 0;
        Random random = new Random();

        for (int i = 0; i < k; i++) {

            double x = random.nextDouble() * radius * 2 - radius * 1;
            double y = random.nextDouble() * radius * 2 - radius * 1;

            if (monteCarlo(x, y, radius)) {
                success++;
            }
            total++;
        }
        return 4 * success / total;
    }

    public static boolean monteCarlo(double x, double y, double radius) {

        double distance = Math.sqrt(x * x + y * y);

        return distance <= radius;

    }
}

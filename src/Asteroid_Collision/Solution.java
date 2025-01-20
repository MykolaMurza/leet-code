package Asteroid_Collision;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                asteroidCollision(new int[]{5, -10, -15, 5, 10, -5, 5, 10, -5, 5, 10, -5, 5, 10, -5})
        ));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];

        int writer = 0;
        for (int reader = 0; reader < asteroids.length; reader++) {
            int asteroid = asteroids[reader];
            if (asteroid > 0) {
                stack[writer] = asteroid;
                writer++;
                continue;
            }

            if (writer != 0 && asteroids[reader - 1] > 0 && writer >= 0) {
                if (stack[writer - 1] > -asteroid) {
                    // The incoming asteroid is smaller.
                    continue;
                } else if (stack[writer - 1] < -asteroid) {
                    // The incoming asteroid is bigger.
                    writer--;
                    reader--;
                } else {
                    // Asteroids are equal.
                    writer--;
                }
            } else {
                if (writer < 0) {
                    writer = 0;
                }
                stack[writer] = asteroid;
                writer++;
            }
        }

        return Arrays.copyOfRange(stack, 0, writer);
    }
}

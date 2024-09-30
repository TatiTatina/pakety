package ru.courses.main;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class Task3 {

        public static void main(String[] args) {
            if(args.length != 2) {
                System.out.println("Пожалуйста, укажите два аргумента: X и Y");
                return;
            }

            String xStr = args[0];
            String yStr = args[1];

            int x = parseInt(xStr);
            int y = parseInt(yStr);
            double result = pow(x, y);

            System.out.println(x + " в степени " + y + " равно: " + result);
        }

        public static int parseInt(String numStr) {
            return Integer.parseInt(numStr);
        }

        public static double pow(int base, int exponent) {
            return Math.pow(base, exponent);
        }
    }
}

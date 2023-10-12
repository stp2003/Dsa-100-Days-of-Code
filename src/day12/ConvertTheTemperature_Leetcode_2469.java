package day12;

import java.util.Arrays;

public class ConvertTheTemperature_Leetcode_2469 {

    //??
    public static double[] convertTemperature(double celsius) {

        double[] arr = new double[2];

        double kelvin = celsius + 273.15;
        double Fahrenheit = (celsius * 1.80) + 32.00;

        arr[0] = kelvin;
        arr[1] = Fahrenheit;

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(45.2354)));
    }
}

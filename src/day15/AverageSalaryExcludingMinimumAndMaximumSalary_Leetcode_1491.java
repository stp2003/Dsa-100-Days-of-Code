package day15;

import java.util.Arrays;

public class AverageSalaryExcludingMinimumAndMaximumSalary_Leetcode_1491 {

    //??
    public static double average(int[] salary) {

        Arrays.sort(salary);
        double sum = 0;

        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        return (sum / (double) (salary.length - 2));
    }

    public static void main(String[] args) {
        System.out.println(average(new int[]{4000, 2000, 1000, 3000}));
    }
}

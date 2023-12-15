package day76;

public class TeemoAttacking_Leetcode_495 {

    //??
    public static int findPoisonedDuration(int[] timeSeries, int duration) {

        if (timeSeries.length == 0) return 0;
        int totalTime = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            totalTime += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        return totalTime + duration;
    }

    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[]{1, 4}, 2));
    }
}

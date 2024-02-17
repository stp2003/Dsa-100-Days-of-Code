package day140;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach_Leetcode_1642 {

    //??
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                heap.offer(diff);
                if (heap.size() > ladders) {
                    bricks -= heap.poll();
                }
                if (bricks < 0) {
                    return i;
                }
            }
        }
        return heights.length - 1;

    }

    public static void main(String[] args) {
        System.out.println(furthestBuilding(new int[]{1, 4, 8, 9, 3}, 5, 4));
    }
}

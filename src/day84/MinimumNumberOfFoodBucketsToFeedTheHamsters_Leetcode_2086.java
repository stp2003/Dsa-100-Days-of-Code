package day84;

public class MinimumNumberOfFoodBucketsToFeedTheHamsters_Leetcode_2086 {

    //??
    public static int minimumBuckets(String hamsters) {

        int noOfBuckets = 0;

        for (int i = 0; i < hamsters.length(); i++) {
            if (hamsters.charAt(i) == 'H') {
                if (i + 1 < hamsters.length() && hamsters.charAt(i + 1) == '.') {
                    noOfBuckets++;
                    i += 2;
                } else if (i - 1 >= 0 && hamsters.charAt(i - 1) == '.') noOfBuckets++;
                else return -1;
            }
        }
        return noOfBuckets;
    }

    public static void main(String[] args) {
        System.out.println(minimumBuckets("H.H"));
    }
}

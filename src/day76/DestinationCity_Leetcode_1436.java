package day76;

import java.util.List;

public class DestinationCity_Leetcode_1436 {

    //??
    public static String destCity(List<List<String>> paths) {

        for (List<String> path : paths) {
            String dest = path.get(1);
            boolean exist = false;

            for (List<String> otherPath : paths) {
                if (otherPath.get(0).equals(dest)) {
                    exist = true;
                    break;
                }
            }

            if (!exist) {
                return dest;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println();
    }
}

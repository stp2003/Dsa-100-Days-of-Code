package day69;

import java.util.ArrayList;

public class CrawlerLogFolder_Leetcode_1598 {

    //??
    public static int minOperations(String[] logs) {
        ArrayList<String> folder = new ArrayList<>();

        for (String log : logs) {
            if (log.equals("../")) {
                if (folder.size() > 1)
                    folder.remove(folder.size() - 1);
                else
                    folder.clear();

            } else if (log.equals("./")) {
                continue;
            } else
                folder.add(log);
        }
        return folder.size();
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"}));
    }
}

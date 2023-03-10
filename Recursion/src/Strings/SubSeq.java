package Strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        ArrayList<String> ans = subseqRE("", "abc");
        System.out.println(ans);

    }
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch,up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqRE(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqRE(p + ch,up.substring(1));
        ArrayList<String> right = subseqRE(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}

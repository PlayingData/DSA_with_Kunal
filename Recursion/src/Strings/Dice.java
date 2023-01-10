package Strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        diceFace("", 4, 4);
        System.out.println(diceRetFace("", 4, 4));
    }

    static void dice(String p, int target) {
        if (target == 0){
            System.out.println(p);
            return;
        }
        // 6 = dice size
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static void diceFace(String p, int target, int face) {
        if (target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);
        }
    }
    static ArrayList<String> diceRet(String p, int target) {
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRet(p + i, target - i));
        }
        return list;
    }

    static ArrayList<String> diceRetFace(String p, int target, int face) {
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceRetFace(p + i, target - i, face));
        }
        return list;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author tuong
 */
public class Asgm3 {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> climbed = new ArrayList<>();

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(ranked);
        List<Integer> new_ranked = new ArrayList<>(set);
        for (int i = 0; i < player.size(); i++) {
            if (player.get(i) < new_ranked.get(new_ranked.size() - 1)) {
                climbed.add(new_ranked.size() + 1);
                continue;
            }
            if (player.get(i) >= new_ranked.get(0)) {
                climbed.add(1);
                continue;
            }

            for (int j = new_ranked.size() - 1; j >= 0; j--) {
                if (player.get(i) < new_ranked.get(j)) {
                    climbed.add(j + 1 + 1);
                    break;
                }
            }
        }
        return climbed;
    }

}

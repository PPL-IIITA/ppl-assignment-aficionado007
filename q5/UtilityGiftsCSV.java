/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author geetika
 */
public class UtilityGiftsCSV {

    static double price, value, util_value, util_class;

    public static ArrayList<utility> generator() {
        ArrayList<utility> utility_giftsArrayList = new ArrayList<utility>(15);
        int i;
        for (i = 0; i < 15; i++) {
            price = 10 + (int) (Math.random() * 200);
            value = 14 + (int) (Math.random() * 150);
            util_value = 15 + (int) (Math.random() * 170);
            util_class = 11 + (int) (Math.random() * 480);
            utility u = new utility(price, value, util_value, util_class);
            utility_giftsArrayList.add(u);
        }
        Collections.sort(utility_giftsArrayList, new utility_price_cmp());
        return utility_giftsArrayList;
    }
}

class utility_price_cmp implements Comparator<utility> {

    public int compare(utility u1, utility u2) {
        if (u1.getPrice() > u2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}

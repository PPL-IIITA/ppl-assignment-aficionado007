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
public class essentialgiftcsv {
   

        static double price, value;

        public static ArrayList<essentialgift> generator() {
            ArrayList<essentialgift> essential_giftsArrayList = new ArrayList<>(15);
            int i;
            for (i = 0; i < 15; i++) {
                price = 11 + (int) (Math.random() * 450);
                value = 11 + (int) (Math.random() * 600);
                essentialgift e = new essentialgift(price, value);
                essential_giftsArrayList.add(e);
            }
            Collections.sort(essential_giftsArrayList, new essential_price_cmp());
            return essential_giftsArrayList;
        }

    }

    class essential_price_cmp implements Comparator<essentialgift> {

        public int compare(essentialgift e1, essentialgift e2) {
            if (e1.getPrice() > e2.getPrice()) {
                return 1;
            } else {
                return -1;
            }
        }
    }


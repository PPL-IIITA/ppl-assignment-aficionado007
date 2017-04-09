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
public class LuxuryGiftsCSV {
   

        static double price, value, lux_rate, diff;

        static ArrayList<luxurygift> generator() {
            ArrayList<luxurygift> luxury_giftsArrayList = new ArrayList<>(15);
            for (int i = 0; i < 15; i++) {
                price = 10 + (int) (Math.random() * 246);
                value = 10 + (int) (Math.random() * 150);
                lux_rate = 10 + (int) (Math.random() * 196);
                diff = 10 + (int) (Math.random() * 175);
                luxurygift l = new luxurygift(price, value, diff, lux_rate);
                luxury_giftsArrayList.add(l);
            }
            Collections.sort(luxury_giftsArrayList, new luxury_price_cmp());
            return luxury_giftsArrayList;
        }
    }

    class luxury_price_cmp implements Comparator<luxurygift> {

        public int compare(luxurygift l1, luxurygift l2) {
            if (l1.getPrice() > l2.getPrice()) {
                return 1;
            } else {
                return -1;
            }
        }
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;
import java.util.ArrayList;
/**
 *
 * @author geetika
 */
public class purchase {
    ArrayList<essentialgift> essential_giftsarrayList = essentialgiftcsv.generator();
    ArrayList<luxurygift> luxury_giftsarrayList = LuxuryGiftsCSV.generator();
    ArrayList<utility> utility_giftsarrayList = UtilityGiftsCSV.generator();

    public double[] buy_essential(double bud) {
        double[] purchase;
        purchase = new double[2];
        purchase[0] = 0.0;
        purchase[1] = 0.0;
        for (essentialgift e : essential_giftsarrayList) {
            double essential_price = e.getPrice();
            double essential_value = e.getPrice();
            if (bud >= essential_price) {
                purchase[0] += essential_price;
                purchase[1] += essential_value;
                bud -= essential_price;
            }
        }
        return purchase;
    }

    public double[] buy_luxury(double bud) {
        double[] purchase;
        purchase = new double[2];
        purchase[0] = 0.0;
        purchase[1] = 0.0;
        for (luxurygift lux : luxury_giftsarrayList) {
            double luxprice = lux.getPrice();
            double luxvalue = lux.getPrice();
            if (bud >= luxprice) {
                purchase[0] += luxprice;
                purchase[1] += luxvalue;
                bud -= luxprice;
            }
        }
        return purchase;
    }

    public double[] buy_utility(double money) {
        double[] purchase;
        purchase = new double[2];
        purchase[0] = 0.0;
        purchase[1] = 0.0;
        for (utility uti : utility_giftsarrayList) {
            double utiprice = uti.getPrice();
            double utivalue = uti.getPrice();
            if (money >= utiprice) {
                purchase[0] += utiprice;
                purchase[1] += utivalue;
                money -= utiprice;
            }
        }
        return purchase;
    }
}

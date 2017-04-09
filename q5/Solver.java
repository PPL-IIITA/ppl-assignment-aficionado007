/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

/**
 *
 * @author geetika
 */
public class Solver {
    String boyname, girlname;
    double boybudget, boyiq, boyatt_lev, boyhappy_lev;
    double girlmaint, girliq, girlatt_lev, girlhappy_lev;
    int boy_typ, girl_typ;

    purchase p = new purchase();

    Solver(couple cpl) {
        boyname = cpl.getBoyname();
        boybudget = cpl.getBudget();
        boyiq = cpl.getBoyiq();
        boyatt_lev = cpl.getBoyattr();
        boyhappy_lev = cpl.getBoyhappy();
        girlname = cpl.getGirlname();
        girlmaint = cpl.getGirl_maintcost();
        girliq = cpl.getGirliq();
        girlatt_lev = cpl.getGirlattr();
        girlhappy_lev = cpl.getGirlhappy();
        boy_typ = (int) cpl.getBoytype();
        girl_typ = (int) cpl.getGirltype();
    }

    public void setGirlHappy(couple c, double ap, double bp, double cp, double av, double bv, double cv) {
        switch ((int) c.getGirltype()) {
            case 1:
                c.setGirlhappy(Math.log(ap + 2 * bp + cp));
                break;
            case 2:
                c.setGirlhappy(ap + bp + cp + av + bv + cv);
                break;
            case 3:
                c.setGirlhappy(Math.exp(ap + bp + cp));
        }
    }

    public void setBoyHappy(couple c) {
        switch ((int) c.getBoytype()) {
            case 1:
                c.setBoyhappy(c.getBudget());
                break;
            case 2:
                c.setBoyhappy(c.getGirlhappy());
                break;
            case 3:
                c.setBoyhappy(c.getGirliq());
        }
    }

    public double compatability() {
        return (Math.abs(boybudget - girlmaint)
                + Math.abs(boyiq - girliq)
                + Math.abs(boyatt_lev - girlatt_lev));
    }

    public double couple_happiness() {
        return (boyhappy_lev + girlhappy_lev);
    }

    double miser_purchasing(couple cpl) {
        double the_budget = cpl.getBudget();
        double ess_price = 0.0, ess_value = 0.0;
        double lux_price = 0.0, lux_value = 0.0;
        double util_price = 0.0, util_value = 0.0;
        if (the_budget > 0) {
            double purchase[] = p.buy_essential(cpl.getMaintcost());
            ess_price = purchase[0];
            ess_value = purchase[1];
            the_budget -= ess_price;
            the_budget -= ess_price;
        }
        if (the_budget > 0) {
            double purchase[] = p.buy_luxury(the_budget);
            lux_price = purchase[0];
            lux_value = purchase[1];
            the_budget -= lux_price;
        }
        if (the_budget > 0) {
            double purchase[] = p.buy_utility(the_budget);
            util_price = purchase[0];
            util_value = purchase[1];
            the_budget -= util_price;
        }
        setGirlHappy(cpl, ess_price, lux_price, util_price, ess_value, lux_value, util_value);
        setBoyHappy(cpl);
        return the_budget;
    }

    public double generous_purchasing(couple cpl) {
        double the_budget = cpl.getBudget();
        double ess_price = 0.0, ess_value = 0.0;
        double lux_price = 0.0, lux_value = 0.0;
        double util_price = 0.0, util_value = 0.0;
        if (the_budget > 0) {
            double purchase[] = p.buy_essential(cpl.getMaintcost());
            ess_price = purchase[0];
            ess_value = purchase[1];
            the_budget -= ess_price;
            the_budget -= ess_price;
        }
        if (the_budget > 0) {
            double purchase[] = p.buy_luxury(the_budget);
            lux_price = purchase[0];
            lux_value = purchase[1];
            the_budget -= lux_price;
        }
        if (the_budget > 0) {
            double purchase[] = p.buy_utility(the_budget);
            util_price = purchase[0];
            util_value = purchase[1];
            the_budget -= util_price;
        }
        setGirlHappy(cpl, ess_price, lux_price, util_price, ess_value, lux_value, util_value);
        setBoyHappy(cpl);
        return the_budget;
    }

    public double geek_purchasing(couple cpl) {
        double the_budget = cpl.getBudget();
        double ess_price = 0.0, ess_value = 0.0;
        double lux_price = 0.0, lux_value = 0.0;
        double util_price = 0.0, util_value = 0.0;
        if (the_budget > 0) {
            double purchase[] = p.buy_essential(cpl.getMaintcost());
            ess_price = purchase[0];
            ess_value = purchase[1];
            the_budget -= ess_price;
            the_budget -= ess_price;
        }
        if (the_budget > 0) {
            double purchase[] = p.buy_luxury(the_budget);
            lux_price = purchase[0];
            lux_value = purchase[1];
            the_budget -= lux_price;
            if (the_budget > 0) {
                double purchase2[] = p.buy_luxury(the_budget);
                lux_price = purchase2[0];
                lux_value = purchase2[1];
                the_budget -= lux_price;
            }
        }
        if (the_budget > 0) {
            double purchase[] = p.buy_utility(the_budget);
            util_price = purchase[0];
            util_value = purchase[1];
            the_budget -= util_price;
        }
        setGirlHappy(cpl, ess_price, lux_price, util_price, ess_value, lux_value, util_value);
        setBoyHappy(cpl);
        return the_budget;
    }

    public void chooser(couple cpl) {
        double the_budget = cpl.getBudget();
        double ess_price = 0.0, ess_value = 0.0;
        double lux_price = 0.0, lux_value = 0.0;
        double util_price = 0.0, util_value = 0.0;
        int c_type = boy_typ;
        switch (c_type) {
            case 1:
                the_budget = miser_purchasing(cpl);
                break;
            case 2:
                the_budget = generous_purchasing(cpl);
                break;
            case 3:
                the_budget = geek_purchasing(cpl);
                break;
        }
        cpl.setBudget(the_budget);
    }

}

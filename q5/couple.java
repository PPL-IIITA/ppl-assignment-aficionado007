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
public class couple {


    String boyname;
    String girlname;
    double boyattr;
    double girlattr;
    double budget;
    double maintcost;
    double boyiq;
    double girliq;
    double boyhappy;
    double girlhappy;
    double boytype;
    double girltype;
    double girl_maintcost;
    public void matchmake(boy b, girl g) {
        boyname = b.retName();
        girlname = g.retName();
        boyattr = b.retAtt_level();
        girlattr = g.retAtt_level();
        budget = b.retBudget();
        maintcost = girl_maintcost = g.retMaintainanceBudget();
        boyiq = b.retInt_level();
        girliq = g.retInt_level();
        boyhappy = b.retBoyHappiness();
        girlhappy = g.retGirlHappiness();
        boytype = b.retType();
        girltype = g.retType();
        //girl_maint = g.getMaincost();
    }
    public String getBoyname() {
        return boyname;
    }

    public void setBoyname(String boyname) {
        this.boyname = boyname;
    }

    public String getGirlname() {
        return girlname;
    }

    public void setGirlname(String girlname) {
        this.girlname = girlname;
    }

    public double getBoyattr() {
        return boyattr;
    }

    public void setBoyattr(double boyattr) {
        this.boyattr = boyattr;
    }

    public double getGirlattr() {
        return girlattr;
    }

    public void setGirlattr(double girlattr) {
        this.girlattr = girlattr;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getMaintcost() {
        return maintcost;
    }

    public void setMaintcost(double maintcost) {
        this.maintcost = maintcost;
    }

    public double getBoyiq() {
        return boyiq;
    }

    public void setBoyiq(double boyiq) {
        this.boyiq = boyiq;
    }

    public double getGirliq() {
        return girliq;
    }

    public void setGirliq(double girliq) {
        this.girliq = girliq;
    }

    public double getBoyhappy() {
        return boyhappy;
    }

    public void setBoyhappy(double boyhappy) {
        this.boyhappy = boyhappy;
    }

    public double getGirlhappy() {
        return girlhappy;
    }

    public void setGirlhappy(double girlhappy) {
        this.girlhappy = girlhappy;
    }

    public double getBoytype() {
        return boytype;
    }

    public void setBoytype(double boytype) {
        this.boytype = boytype;
    }

    public double getGirltype() {
        return girltype;
    }

    public void setGirltype(double girltype) {
        this.girltype = girltype;
    }

    public double getGirl_maintcost() {
        return girl_maintcost;
    }

    public void setGirl_maintcost(double girl_maintcost) {
        this.girl_maintcost = girl_maintcost;
    }


}
    


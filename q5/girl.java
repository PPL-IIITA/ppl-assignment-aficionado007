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
public class girl {
 
    protected String name;
    protected int attr;
    protected int maintbud;
    protected int aptlevel;
    protected boolean committed;
    protected String boyfriend;
    protected int type;
    protected double happiness;

    public girl(String s, int a, int i, int b, int t) {
        this.name = s;
        this.attr = a;
        this.aptlevel = i;
        this.maintbud = b;
        this.type = t;
        this.committed = false;
        this.happiness = 0.00;
    }

    public String retName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int retAtt_level() {
        return attr;
    }

    public void setAtt_level(int a) {
        attr = a;
    }

    public int retInt_level() {
        return aptlevel;
    }

    public void setInt_level(int i) {
        aptlevel = i;
    }

    public int retMaintainanceBudget() {
        return maintbud;
    }

    public void setMaintainanceBudget(int b) {
        maintbud = b;
    }

    public boolean isComm() {
        return committed;
    }

    public void setComm(boolean ic) {
        committed = ic;
    }

    public int retType() {
        return type;
    }

    public double retGirlHappiness() {
        return happiness;
    }
   }    


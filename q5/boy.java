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
public class boy {
    protected String name;
    protected int aptlevel;
    protected int bud;
    protected int attract;
    protected boolean committed;
    protected String girlfriend;
    protected int type;

    double happy;

    public boy(String s, int a, int i, int b, int t) {
        this.name = s;
        this.attract = a;
        this.aptlevel = i;
        this.bud = b;
        this.type = t;
        this.committed = false;
        happy = 0.0;
    }

    public String retName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public double retAtt_level() {
        return attract;
    }

    public void setAtt_level(int a) {
        attract = a;
    }

    public double retInt_level() {
        return aptlevel;
    }

    public void setInt_level(int i) {
        aptlevel = i;
    }

    public double retBudget() {
        return bud;
    }

    public void setBudget(int b) {
        bud = b;
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

    public double retBoyHappiness() {
        return happy;
    }

}

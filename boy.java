/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques1;

/**
 *
 * @author geetika
 */
public class boy {
     protected String  name;
    protected int aptlevel;
    protected int bud;
    protected int attract;
    protected boolean committed;
    protected String girlfriend;
    protected int type;
    public boy(String s, int a, int i, int b,int t) {
        this.name = s;
        this.attract = a;
        this.aptlevel = i;
        this.bud = b;
        this.type=t;
        this.committed = false;
    }
}

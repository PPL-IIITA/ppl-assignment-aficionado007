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
public class girl {
 protected String name;
    protected int attr;
    protected int maintbud;
    protected int aptlevel;
    protected boolean committed;
    protected String boyfriend;
    protected int type;
    public girl(String s, int a, int i, int b,int t) {
        this.name = s;
        this.attr = a;
        this.aptlevel = i;
        this.maintbud = b;
        this.type=t;
        this.committed= false;
        }    
}

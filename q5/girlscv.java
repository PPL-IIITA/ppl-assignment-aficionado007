/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;
import java.util.*;
import java.io.*;
/**
 *
 * @author geetika
 */
public class girlscv {
    protected String name;
    protected int attr;
    protected int maintbud;
    protected int aptlevel;
    protected boolean committed;
    protected String boyfriend;
    protected int type;

    public ArrayList<girl> generate() throws FileNotFoundException, IOException {
        PrintWriter pw = new PrintWriter(new File("GIRLS.csv"));
        StringBuilder sb = new StringBuilder();
        ArrayList<girl> Arr2 = new ArrayList<girl>(30);
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            name = "G#" + (i + 1);
            attr = (int) (10 + (Math.random() * 23));
            maintbud = (int) (77 + (Math.random() * 810));
            aptlevel = (int) (21 + (Math.random() * 19));
            type = rand.nextInt(3);
            committed = false;
            sb.append(name);
            sb.append(',');
            sb.append(attr);
            sb.append(',');
            sb.append(maintbud);
            sb.append(',');
            sb.append(aptlevel);
            sb.append(',');
            sb.append(type);
            sb.append(',');
            sb.append(committed);
            sb.append('\n');
            girl obj = new girl(name, attr, aptlevel, maintbud, type);
            Arr2.add(obj);
        }
        pw.write(sb.toString());
        pw.close();
        return Arr2;
    }
    
}

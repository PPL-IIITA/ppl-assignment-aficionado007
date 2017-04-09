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
public class boycsv {



        protected String name;
        protected int aptlevel;
        protected int bud;
        protected int attract;
        protected boolean committed;
        protected int type;
        protected String girlfriend;

        public ArrayList<boy> generate() throws FileNotFoundException, IOException //public ArrayList<boys> generate() throws IOException
        {
            PrintWriter pw = new PrintWriter(new File("BOYS.csv"));
            StringBuilder sb = new StringBuilder();
            Random rand = new Random();
            ArrayList<boy> Arr1 = new ArrayList<boy>(50);
            for (int i = 0; i < 50; i++) {
                name = "B#" + (i + 1);
                attract = (int) (7 + (Math.random() * 21));
                bud = (int) (120 + (Math.random() * 970));
                aptlevel = (int) (19 + (Math.random() * 21));
                type = rand.nextInt(3);
                committed = false;
                sb.append(name);
                sb.append(',');
                sb.append(attract);
                sb.append(',');
                sb.append(bud);
                sb.append(',');
                sb.append(aptlevel);
                sb.append(',');
                sb.append(type);
                sb.append(',');
                sb.append(committed);
                sb.append("\n");
                //sb.append(',');
                boy obj = new boy(name, attract, aptlevel, bud, type);
                Arr1.add(obj);
            }
            pw.write(sb.toString());
            pw.close();
            return Arr1;
        }
    }


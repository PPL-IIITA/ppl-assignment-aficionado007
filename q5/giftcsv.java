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
public class giftcsv {
       
        protected int price;
        protected int value;
        protected int type;
    public ArrayList<gift> generate() throws FileNotFoundException, IOException {
            PrintWriter pw = new PrintWriter(new File("GIFTS.csv"));
            StringBuilder sb = new StringBuilder();
            ArrayList<gift> Arr2 = new ArrayList<gift>(100);
            Random rand = new Random();
            for (int i = 0; i < 100; i++) {
                
                price = (int) (10 + (Math.random() * 23));
                value = (int) (10+ (Math.random() * 25));
                type = rand.nextInt(3);
                sb.append(price);
                sb.append(',');
                sb.append(value);
                sb.append(',');
                sb.append(type);
                sb.append('\n');
                gift obj = new gift(price, value, type);
                Arr2.add(obj);
            }
            pw.write(sb.toString());
            pw.close();
            return Arr2;
        }
    
}

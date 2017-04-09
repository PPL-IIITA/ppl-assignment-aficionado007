/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;
import java.util.*;
import java.io.*;
import java.util.Comparator;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 *
 * @author geetika
 */
public class Q5 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        ArrayList<boy> Arr_males = new ArrayList<>(50);
        ArrayList<girl> Arr_females = new ArrayList<>(30);
        boycsv obj1 = new boycsv();
        Arr_males = obj1.generate();
        girlscv obj2 = new girlscv();
        Arr_females=obj2.generate();
        ArrayList<gift> gifts=new ArrayList<>(100);
        giftcsv obj3=new giftcsv();
        gifts=obj3.generate();
        ArrayList<couple> couples=new ArrayList<>(100);
        Collections.sort(Arr_males, new Comparator<boy>() {

            @Override
            public int compare(boy b1, boy b2) {
                return b2.attract - b1.attract;
            }
        });
        
        int k,j;
        int y=0,g=0;
        while (y<30 && g<50)
            
        {  
           
            Collections.sort(Arr_females, new Comparator<girl>() {

                @Override
                public int compare(girl g1, girl g2) {
                    return g1.maintbud - g2.maintbud;
                }
            });
            if(Arr_females.get(y).committed==false )
               {
                      for(k=0;k<Arr_males.size();k++)
                                {
                                    
                                    if(Arr_males.get(k).bud>Arr_females.get(y).maintbud && Arr_males.get(k).committed==false)
                                        {  
                                             
                                             Arr_females.get(y).committed = true;
                                             couple cop=new couple();
                                             cop.matchmake(Arr_males.get(k),Arr_females.get(y));
                                             Arr_males.get(k).committed = true;
                                             couples.add(cop);
                                             break;
                                        }
                                  }
                
                }
           
           if(Arr_males.get(g).committed==false)
                {
                    
                     Collections.sort(Arr_females, new Comparator<girl>() {

                        @Override
                     public int compare(girl g1, girl g2) {
                     return g2.attr - g1.attr;
                       }
                     });
                  for(j=0;j<Arr_females.size();j++)
                    {
                        if(Arr_females.get(j).maintbud < Arr_males.get(g).bud && Arr_females.get(j).committed == false)
                        {
                           
                            Arr_males.get(g).committed = true;
                            couple cop = new couple();
                            cop.matchmake(Arr_males.get(g), Arr_females.get(j));
                            Arr_females.get(j).committed = true;
                            couples.add(cop);
                            break;
                        }
                    }
                }
            y++;
            g++;
        }
        couplecsv csVgeneratorCouple = new couplecsv();
        new Runner(couples);
        csVgeneratorCouple.generate(couples);
           
}
}
         
           
       
    


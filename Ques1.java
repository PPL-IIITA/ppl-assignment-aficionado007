/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques1;


import java.io.*;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 *
 * @author geetika
 */
public class Ques1 {

    
    public static boolean check (boy b,girl g )
    {
        if( b.bud>=g.maintbud && (b.aptlevel- g.aptlevel)<=10 && (b.attract >g.attr &&(b.committed==false &&(g.committed==false))))
        {
               //logger.info(b.name +" Is Committed With "+g.name);
               b.committed=true;
               g.committed=true;
               b.girlfriend=g.name;
               g.boyfriend=b.name;
                return true;
        }
        else
                return false;
    }
     public static void main(String[] args)throws FileNotFoundException, IOException
    {
        Logger logger = Logger.getLogger("MyLog");  
        FileHandler fh;
        try
        {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("LOG222.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);
        }
        catch (SecurityException e)
        {  
            e.printStackTrace();  
        }
        catch (IOException e)
        {  
            e.printStackTrace();  
        }   
        ArrayList<boy> Arr_males = new ArrayList<boy>(50);
        ArrayList<girl> Arr_females = new ArrayList<girl>(30);
        CSVGEN1B obj1=new CSVGEN1B();
        Arr_males=obj1.generate();
        CSVGEN1G obj2=new CSVGEN1G();
        Arr_females=obj2.generate();
        for(boy b :Arr_males)
        {
            for(girl g : Arr_females)
            {
               if(check(b,g))
               {
                   
                   logger.info(b.name +" Is Committed With "+g.name);
               }
            }
        }
    }
}

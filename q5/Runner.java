/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author geetika
 */
public class Runner {
    public Runner(ArrayList<couple> coupleArrayList) throws FileNotFoundException {Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        try {

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("LOG222.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Solver> Solvers = new ArrayList<Solver>(10);
        for (couple couple : coupleArrayList) {
            Solver q2 = new Solver(couple);
            q2.chooser(couple);
            Solvers.add(q2);
        }
        int k = 5;
        logger.info("Happiest");
        int cnt = 0;
        for (couple c : coupleArrayList ){
            if (cnt++ == k) {
                break;
            }
            logger.info(c.getBoyname() + ' ' + c.getGirlname());
        }
        
        
    }
}


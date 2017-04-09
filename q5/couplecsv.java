/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author geetika
 */
public class couplecsv {
    public void generate(ArrayList<couple> arrayListcouples) throws FileNotFoundException {
        PrintWriter pwriter = new PrintWriter(new File("Couple.csv"));
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("boyname");
        sbuilder.append(',');
        sbuilder.append("boybudget");
        sbuilder.append(',');
        sbuilder.append("boyiq");
        sbuilder.append(',');
        sbuilder.append("boyattract");
        sbuilder.append(',');
        sbuilder.append("boytype");
        sbuilder.append(',');
        sbuilder.append("boyhappiness");
        sbuilder.append(',');
        sbuilder.append("girlname");
        sbuilder.append(',');
        sbuilder.append("girlmaintain");
        sbuilder.append(',');
        sbuilder.append("girliq");
        sbuilder.append(',');
        sbuilder.append("girlattract");
        sbuilder.append(',');
        sbuilder.append("girltype");
        sbuilder.append(',');
        sbuilder.append("girlhappiness");
        sbuilder.append('\n');

        for (couple couples : arrayListcouples) {
            sbuilder.append(couples.getBoyname());
            sbuilder.append(',');
            sbuilder.append(couples.getBudget());
            sbuilder.append(',');
            sbuilder.append(couples.getBoyiq());
            sbuilder.append(',');
            sbuilder.append(couples.getBoyattr());
            sbuilder.append(',');
            sbuilder.append(couples.getBoytype());
            sbuilder.append(',');
            sbuilder.append(couples.getBoyhappy());
            sbuilder.append(',');

            sbuilder.append(couples.getGirlname());
            sbuilder.append(',');
            sbuilder.append(couples.getMaintcost());
            sbuilder.append(',');
            sbuilder.append(couples.getGirliq());
            sbuilder.append(',');
            sbuilder.append(couples.getGirlattr());
            sbuilder.append(',');
            sbuilder.append(couples.getGirltype());
            sbuilder.append(',');
            sbuilder.append(couples.getGirlhappy());
            sbuilder.append(',');
            sbuilder.append('\n');
        }
        pwriter.write(sbuilder.toString());
        pwriter.close();
        System.out.println("Couple written!");
    }
}

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
public class utility {
    double util_value;
    double util_class;
    double price;
    double value;

    public utility(double price, double value, double util_value, double util_class) {
        this.util_value = util_value;
        this.util_class = util_class;
        this.price = price;
        this.value = value;
    }

   /* utility(double price, double value, double util_value, double util_class) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public double getUtil_value() {
        return util_value;
    }

    public void setUtil_value(double util_value) {
        this.util_value = util_value;
    }

    public double getUtil_class() {
        return util_class;
    }

    public void setUtil_class(double util_class) {
        this.util_class = util_class;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


}

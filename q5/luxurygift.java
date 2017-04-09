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
public class luxurygift {
    double price;
    double value;
    double difficulty;
    double lux_rating;

    public luxurygift(double price, double value, double difficulty, double lux_rating) {
        this.price = price;
        this.value = value;
        this.difficulty = difficulty;
        this.lux_rating = lux_rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public double getLux_rating() {
        return lux_rating;
    }

    public void setLux_rating(double lux_rating) {
        this.lux_rating = lux_rating;
    }

}

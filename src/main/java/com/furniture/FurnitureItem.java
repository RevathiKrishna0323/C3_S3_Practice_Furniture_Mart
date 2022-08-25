/*
 * Author Name: Revathi
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.furniture;

public class FurnitureItem {
    //declaring private attributes in the class
    private String code;
    private String type;
    private int grade;
    private String colour;
    private String usage;
    private double price;
    // declaring static and final int variable
    public static final int DISCOUNT = 5;
    private String outdoor;

    //defining a no argument constructor in the furniture item class
    public FurnitureItem() {
    }
    // creating public getter and setter methods for the instance variables.


    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public int getGrade() {
        return grade;
    }

    public String getColour() {
        return colour;
    }

    public String getUsage() {
        return usage;
    }

    public double getPrice() {
        return price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // define a calculate discount method with return float
    public double CalculateDiscount(int price, String usage) {
        if (grade == 1 && usage == outdoor) {
            // give 5% discount
            double discountedPrice = price - (price * 0.05);
        }
        return price;
    }
}

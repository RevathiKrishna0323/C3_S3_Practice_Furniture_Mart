package com.furniture;

class FurnitureItem {
    //declaring private attributes in the class
    private String code;
    private String type;
    private int grade;
    private String colour;
    private String usage;
    private double price;
    private double discountedPrice;
    // declaring static and final int variable
    public static final int DISCOUNT = 5;
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
    public double CalculateDISCOUNT(double price) {

        if (grade == 1 && usage.equals("outdoor")) {
        }

        return price - (price * DISCOUNT / 100);

    }
}
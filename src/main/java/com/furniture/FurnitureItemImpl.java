/*
 * Author Name: Revathi
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.furniture;

public class FurnitureItemImpl {
    private static double discountedPrice;

    public static void main(String[] args) {
        //create obj with class name
        FurnitureItem furnitureItem = new FurnitureItem();
        furnitureItem.getCode();
        furnitureItem.getType();
        furnitureItem.getGrade();
        furnitureItem.getColour();
        furnitureItem.getUsage();
        furnitureItem.getPrice();
        furnitureItem.setCode("101");
        furnitureItem.setType("table");
        furnitureItem.setGrade(1);
        furnitureItem.setColour("green");
        furnitureItem.setUsage("outdoor");
        furnitureItem.setPrice(10);
        furnitureItem.calculateDiscount(1000);
        System.out.println("Discounted price = " + " $ " + discountedPrice);

    }
}

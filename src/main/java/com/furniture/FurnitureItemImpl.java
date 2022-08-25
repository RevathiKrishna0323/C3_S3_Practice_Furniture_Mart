/*
 * Author Name: Revathi
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.furniture;

public class FurnitureItemImpl {
    public static void main(String[] args) {
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
        furnitureItem.CalculateDiscount(double price, int discount);

    }
}

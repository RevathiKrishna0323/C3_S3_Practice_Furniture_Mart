/*
 * Author Name: Revathi
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.furniture;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        //create obj with class name
        FurnitureItem furnitureItem = new FurnitureItem();
        furnitureItem.setCode("101");
        furnitureItem.setType("table");
        furnitureItem.setGrade(1);
        furnitureItem.setColour("green");
        furnitureItem.setUsage("outdoor");
        furnitureItem.setPrice(10);
        System.out.println("Furniture code = " + furnitureItem.getCode());
        System.out.println("Furniture type = " + furnitureItem.getType());
        System.out.println("Furniture grade = " + furnitureItem.getGrade());
        System.out.println("Furniture colour = " + furnitureItem.getColour());
        System.out.println("Furniture usage = " + furnitureItem.getUsage());
        System.out.println("Furniture price = " + furnitureItem.getPrice());
        System.out.println("Discounted price = $" + furnitureItem.CalculateDISCOUNT(500.0));


    }
}

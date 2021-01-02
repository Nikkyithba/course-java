package com.nikky.javabasics;

public class Product {

    private String code;
    private String description;
    private double price ;
    protected static int count = 0 ;

    public Product(String co, String de, double pr){
        code=co;
        description=de;
        price=pr;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }
}

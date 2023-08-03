package com.workintech.product.product;

public class Coke extends ProductForSale{

private boolean isDiet;
    public Coke(ProductType type, int price, String description, boolean isDiet) {
        super(type, price, description);
        this.isDiet = isDiet;
    }

    @Override
    public void showDetails() {
        System.out.println("****************************");
        System.out.println("Product Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Percentage: " + isDiet + "%");
    }


}

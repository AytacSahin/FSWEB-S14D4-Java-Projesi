package com.workintech.product.product;

public class Chocolate extends ProductForSale{
    private int cocoaPercentage;

    public Chocolate(ProductType type, int price, String description, int cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("****************************");
        System.out.println("Product Type: " + getType());
        System.out.println("Price: " + getPrice() + "TL");
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Percentage: " + cocoaPercentage + "%");
    }

}

package com.workintech.product.product;

public class Bread extends ProductForSale{
    private boolean hasGluten;

    public Bread(ProductType type, int price, String description, boolean hasGluten) {
        super(type, price, description);
        this.hasGluten = hasGluten;
    }

    public boolean isHasGluten() {
        return hasGluten;
    }

    @Override
    public void showDetails() {
        System.out.println("****************************");
        System.out.println("Product Type: " + getType());
        System.out.println("Price: TL" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Has Gluten?: " + hasGluten);
    }

}

package com.workintech.product.main;


import com.workintech.product.product.*;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate(ProductType.GIDA, 5, "güzel lezzet", 66);
        products[1] = new Coke(ProductType.GIDA, 5, "lutfen diyet kola alabilir miyim ?", false);
        products[2] = new Bread(ProductType.GIDA, 5, "taze ekmek", true);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null) {
            for (ProductForSale product : products) {
                if (product != null) {
                    product.showDetails();
                }
            }
        }
    }
}
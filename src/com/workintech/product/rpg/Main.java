package com.workintech.product.rpg;

public class Main {
    public static void main(String[] args) {
        Troll yaratik = new Troll("Kurt", 100, 20);
        System.out.println("Yaratik Adi:" + yaratik.getName());
        System.out.println("Yaratik Hit Point:" + yaratik.getHitPoints());
        System.out.println("Yaratik Damage:" + yaratik.getDamage());
    }
}

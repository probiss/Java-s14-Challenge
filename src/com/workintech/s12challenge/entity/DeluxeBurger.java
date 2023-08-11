package com.workintech.s12challenge.entity;

public class DeluxeBurger extends Hamburger{

    private String drink;
    private String cips;

    public DeluxeBurger() {
        super("Deluxe Burger", 19.1, "Double Sandwich");
        super.setMeat("Double");
    }


    @Override
    public void addHamburgerAddition1(String addition, double price) {
        System.out.println("Deluxe burger için malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addition, double price) {
        System.out.println("Deluxe burger için malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addition, double price) {
        System.out.println("Deluxe burger için malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String addition, double price) {
        System.out.println("Deluxe burger için malzeme eklenemez.");
    }
}
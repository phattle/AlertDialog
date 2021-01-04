package com.example.alertdialog;

public interface OrderBuild {
    OrderBuild setOrderType(OrderType orderType);
    OrderBuild setBreadType(BreadType breadType);
    OrderBuild setSauceType(SauceType sauceType);
    OrderBuild setVegetableType(VegetableType vegetableType);
    Order build();

}

package service;

import model.Discountable;
import model.Food;


public class ShoppingCart {

    private final Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getSumOfAmountWithoutDiscount() {
        double allAmount = 0;
        for (Food item : products) {
            allAmount = allAmount + item.getAmount() * item.getPrice();
        }
        return allAmount;
    }

    public double getTotalAmountWithDiscount() {
        double allAmount = 0;
        for (Food item : products) {
            if (item instanceof Discountable) {
                double discount = ((Discountable) item).getDiscount();
                allAmount = allAmount + (1 - discount / 100) * ((Food) item).getAmount() * ((Food) item).getPrice();
            } else {
                allAmount = allAmount + item.getAmount() * item.getPrice();
            }
        }
        return allAmount;
    }

    public double getSumOfVegetarianProducts() {
        double vegetarianAmount = 0;
        for (Food item : products) {
            if (item.isVegetarian()) { // Проверяем, является ли продукт вегетарианским
                vegetarianAmount += item.getAmount() * item.getPrice();
            }
        }
        return vegetarianAmount;

    }
}

package model;

import static model.constants.Colour.RED;
import static model.constants.Discount.Discount;

public class Apple extends Food implements Discountable {
    private String COLOUR;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.COLOUR = colour;
    }

    @Override
    public double getDiscount() {
        if (COLOUR == RED) {
            return Discount;
        }
        return 0;
    }
}
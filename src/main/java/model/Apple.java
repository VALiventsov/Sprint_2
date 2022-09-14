package model;

import static model.constants.Colour.*;
import static model.constants.Discount.*;

public class Apple extends Food {
    private String colour;

    //обозначаем поля
    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.colour = colour;
    }

    //определяем скидку
    @Override
    public double getDiscount() {
        if (colour.equals(COLOR_RED)) {
            return DISCOUNT_60;
        } else {
            return DISCOUNT_0;
        }
    }
}

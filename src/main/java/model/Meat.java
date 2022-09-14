package model;

import static model.constants.Discount.*;

public class Meat extends Food {
    //определяем поля
    public Meat(int amount, double price) {
        super(amount, price, false);

    }

    //определяем скидку
    @Override
    public double getDiscount() {
        return DISCOUNT_0;
    }
}

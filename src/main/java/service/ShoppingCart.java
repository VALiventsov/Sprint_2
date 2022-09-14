package service;

import model.Food;

public class ShoppingCart {
    private Food[] purchase;

    public ShoppingCart(Food[] purchase) {
        this.purchase = purchase;
    }

    //общая сумма товаров
    public double sumPurchase() {
        double price = 0.0;
        for (int i = 0; i < purchase.length; i++) {
            price += purchase[i].getTotalPrice();
        }
        return price;
    }

    //сумма товаров со скидкой
    public double sumPurchaseDiscount() {
        double price = 0.0;
        for (int i = 0; i < purchase.length; i++) {
            price += (purchase[i].getTotalPrice() * (1 - (purchase[i].getDiscount() / 100)));
        }
        return price;
    }

    //сумма вегетарианских товаров
    public double sumPurchaseVegetarian() {
        double price = 0.0;
        for (int i = 0; i < purchase.length; i++) {
            if (purchase[i].getIsVegetarian())
                price += purchase[i].getTotalPrice();
        }
        return price;
    }


}

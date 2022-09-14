import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.*;

public class Main {
    public void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food applesGreen = new Apple(8, 60, COLOR_GREEN);
        Food applesRed = new Apple(10, 50, COLOR_RED);

        Food[] purchase = {meat, applesGreen, applesRed};

        ShoppingCart pack = new ShoppingCart(purchase);
        System.out.print("Итоговая цена всех товаров в корзине: ");
        System.out.println(pack.sumPurchase());
        System.out.print("Общая сумма скидки на все товары в корзине: ");
        System.out.println(pack.sumPurchase() - pack.sumPurchaseDiscount());
        System.out.print("Суммарная цена всех вегетарианских продуктов в корзине: ");
        System.out.println(pack.sumPurchaseVegetarian());
        System.out.print("Сколько можно это терпеть");
        //да мать твою!
    }
}

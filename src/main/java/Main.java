import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, "red");
        Apple greenApples = new Apple(8, 60, "green");

        Food[] products = {meat, redApples, greenApples};

        ShoppingCart shoppingCart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getSumOfAmountWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getTotalAmountWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getSumOfVegetarianProducts());
    }
}

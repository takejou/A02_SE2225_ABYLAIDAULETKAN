class Latte extends CoffeeAdd {
    public Latte(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Latte Coffee"; // расширение заказа
    }

    public double cost() {
        return coffee.cost() + 4.0; // добавление к цене
    }
}

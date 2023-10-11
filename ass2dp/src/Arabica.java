class Arabica extends CoffeeAdd {
    public Arabica(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Arabica Coffee"; // расширение заказа
    }

    public double cost() {
        return coffee.cost() + 3.0; // добавление к цене
    }
}
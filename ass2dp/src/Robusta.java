class Robusta extends CoffeeAdd {
    public Robusta(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Robusta Coffee"; // расширение заказа
    }

    public double cost() {
        return coffee.cost() + 3.5; // добавление к цене
    }
}
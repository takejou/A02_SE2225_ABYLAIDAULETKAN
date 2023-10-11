class Liquor extends CoffeeAdd {
    public Liquor(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", with Liquor";
    }

    public double cost() {
        return coffee.cost() + 5.0;
    }
}
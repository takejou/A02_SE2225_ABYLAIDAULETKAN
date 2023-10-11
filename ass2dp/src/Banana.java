class Banana extends CoffeeAdd {
    public Banana(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", with Banana Syrup";
    }

    public double cost() {
        return coffee.cost() + 3.0;
    }
}
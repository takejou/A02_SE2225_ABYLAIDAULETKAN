class ChocolateSyrup extends CoffeeAdd {
    public ChocolateSyrup(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", with Chocolate Syrup";
    }

    public double cost() {
        return coffee.cost() + 2.0;
    }
}
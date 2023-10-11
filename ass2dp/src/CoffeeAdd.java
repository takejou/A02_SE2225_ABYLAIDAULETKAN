abstract class CoffeeAdd implements Coffee {
    protected Coffee coffee;

    public CoffeeAdd(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription(); //расширение нашего кофе
    }
}
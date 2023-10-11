import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Coffee coffee = null;
        double totalCost = 0;
        List<String> orderDetails = new ArrayList<>();

        while (true) {
            System.out.println("1. Small Coffee");
            System.out.println("2. Medium Coffee");
            System.out.println("3. Large Coffee");

            int sizeChoice = input.nextInt();

            if (sizeChoice == 1) {
                coffee = new SmallCoffee();
            } else if (sizeChoice == 2) {
                coffee = new MediumCoffee();
            } else if (sizeChoice == 3) {
                coffee = new LargeCoffee();
            } else {
                System.out.println("Wrong choice.");
                System.exit(0);
            }

            System.out.println("1. Arabica Coffee");
            System.out.println("2. Robusta Coffee");
            System.out.println("3. Latte Coffee");

            int typeChoice = input.nextInt();

            if (typeChoice == 1) {
                coffee = new Arabica(coffee);
            } else if (typeChoice == 2) {
                coffee = new Robusta(coffee);
            } else if (typeChoice == 3) {
                coffee = new Latte(coffee);
            }

            System.out.println("1. Banana Syrup");
            System.out.println("2. Chocolate Syrup");
            System.out.println("3. Liquor");

            int syrupChoice = input.nextInt();

            if (syrupChoice == 1) {
                coffee = new Banana(coffee);
            } else if (syrupChoice == 2) {
                coffee = new ChocolateSyrup(coffee);
            } else if (syrupChoice == 3) {
                coffee = new Liquor(coffee);
            }

            totalCost += coffee.cost();
            orderDetails.add(coffee.getDescription() + " - $" + coffee.cost());

            System.out.println("Total cost: $" + totalCost);

            System.out.println("1. Confirm Purchase");
            System.out.println("2. Add more");

            int confirmChoice = input.nextInt();

            if (confirmChoice == 1) {
                System.out.println("Your order:");
                for (String orderDetail : orderDetails) {
                    System.out.println(orderDetail);
                }
                System.out.println("Total cost: $" + totalCost);
                break; // Завершаем цикл заказа
            }
        }
    }
}

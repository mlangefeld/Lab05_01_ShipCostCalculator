import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double price = 0.0;
        double shippingCost = 0.0;
        double totalCost = 0.0;

        System.out.print("Enter the price of the item: ");

        if (in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine();
            if (price >= 100){
                System.out.println("Your total is " + price);
            } else {
                shippingCost = price * 0.02;
                totalCost = shippingCost + price;
                System.out.println("Your total including a " + shippingCost + " shipping fee is " + totalCost);
            }

        }
    }
}
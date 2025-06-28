import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double GST_RATE = 0.05;

        System.out.println("Welcome to The Coffee Counter Chronicles!");

        while (true) {
            System.out.println("\n--- New Customer ---");
            System.out.print("Enter coffee type (Espresso, Latte, Cappuccino) or 'exit' to quit: ");
            String coffeeType = input.nextLine();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using The Coffee Counter!");
                break; 
            }

            double pricePerCup = 0.0;
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    pricePerCup = 2.50;
                    break;
                case "latte":
                    pricePerCup = 3.00;
                    break;
                case "cappuccino":
                    pricePerCup = 3.50;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please choose from Espresso, Latte, or Cappuccino.");
                    continue; 
            }

            System.out.print("Enter quantity: ");
            int quantity = 0;
            try {
                quantity = Integer.parseInt(input.nextLine());
                if (quantity <= 0) {
                    System.out.println("Quantity must be a positive number.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid quantity. Please enter a number.");
                continue;
            }

            double subTotal = pricePerCup * quantity;
            double gstAmount = subTotal * GST_RATE;
            double totalBill = subTotal + gstAmount;

            System.out.printf("Subtotal: $%.2f%n", subTotal);
            System.out.printf("GST (%.0f%%): $%.2f%n", (GST_RATE * 100), gstAmount);
            System.out.printf("Total Bill: $%.2f%n", totalBill);
        }

        input.close();
    }
}

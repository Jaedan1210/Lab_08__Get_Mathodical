import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice;
        boolean keepShopping = true;
        double totalPrice = 0;

        // Continue until the user decides to stop shopping
        while (keepShopping) {
            // Ask for the price of the item, with validation for the range 0 to 10
            itemPrice = SafeInput.getRangedDouble(in, "Enter price of item (max $10.00): ", 0, 10);
            totalPrice += itemPrice;  // Add the price to the total

            // Ask the user if they have more items, Y/N confirmation
            keepShopping = SafeInput.getYNConfirm(in, "Do you have more items? (Y/N): ");
        }

        // Display the total cost of items
        System.out.printf("Your cart total is $%.2f%n", totalPrice);
    }
}


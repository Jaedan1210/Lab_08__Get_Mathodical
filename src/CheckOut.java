import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice;
        boolean keepShopping = true;
        double totalPrice = 0;

        // Please Continue until the user decides to stop shopping
        while (keepShopping) {
            // Please ask for the price of the item, with a validation for the range 0 to 10
            itemPrice = SafeInput.getRangedDouble(in, "Please enter the price of the item (max $10.00): ", 0, 10);
            totalPrice += itemPrice;  // Please add the price to the total

            // Ask the user if they have more items, Y/N confirmation
            keepShopping = SafeInput.getYNConfirm(in, "Do you have any more items? (Y/N): ");
        }

        // Display the total cost of items
        System.out.printf("Your personal cart total is $%.2f%n", totalPrice);
    }
}


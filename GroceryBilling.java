import java.util.Scanner;

public class GroceryBilling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] itemName = new String[10];
        int[] quantity = new int[10];
        double[] price = new double[10];

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem " + (i + 1));

            System.out.print("Item Name: ");
            itemName[i] = sc.nextLine();

            System.out.print("Price: ");
            price[i] = sc.nextDouble();

            System.out.print("Quantity: ");
            quantity[i] = sc.nextInt();
            sc.nextLine();

            total += price[i] * quantity[i];
        }

        System.out.println("\n========== GROCERY BILL ==========");

        for (int i = 0; i < n; i++) {
            System.out.println(itemName[i] + " x " + quantity[i]
                    + " = ₹" + (price[i] * quantity[i]));
        }

        System.out.println("----------------------------------");
        System.out.println("Total Amount : ₹" + total);
        System.out.println("Thank You! Visit Again.");
    }
}
import java.util.Scanner;

public class Main {
    private static Product[] products = new Product[]{
            new Product("water", 1.0F),
            new Product("sprite", 1.2F),
            new Product("cola", 1.3F),
            new Product("fanta", 1.1F),
            new Product("orange", 1.5F)
    };
    // create an object of the class scanner, and use it to get input
    private static Scanner readInput = new Scanner(System.in);
    public static void main(String[] args) {

        int userOption;

        System.out.println("+--------------------------+");
        System.out.println("|      Vending Machine     |");
        System.out.println("+--------------------------+");

        for(int i = 0; i < products.length; i++) {
            System.out.println("|\t " + (i + 1) + "\t" + products[i].getName() + "\t" + products[i].getPrice() + "\t" + products[i].getStock() + "\t  |");
        }

        System.out.println("+--------------------------+");
        System.out.println("Enter a number (0 = Exit)");

        do {
            // will get input from the user
            userOption = readInput.nextInt();
        } while (userOption != 0);


        // need to check how many of the selected items are available
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingList shoppingList = new ShoppingList();
        for (int i = 0; i < 10; i++) {
            System.out.println("chnoo baghi tchri");
            String name = scanner.nextLine();
            System.out.println("ch7al bghiti");
            float quantity = Float.parseFloat(scanner.nextLine());
            Product product = new Product(name, quantity);
            shoppingList.addProduct(product);
            System.out.println("bghiti tchri " + shoppingList.toString());
        }


    }
}

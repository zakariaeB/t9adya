import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public String toString() {
        return "ShoppingList{" +
                "products=" + products +
                '}';
    }
}

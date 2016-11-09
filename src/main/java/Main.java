import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String url="jdbc:mysql://localhost/t9adya";
        String userName= "root";
        String passWord="";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, passWord);
            System.out.println("connection is etablished");
            Scanner scanner = new Scanner(System.in);
            ShoppingList shoppingList = new ShoppingList();
            for (int i = 0; i < 10; i++) {
                System.out.println("chnoo baghi tchri");
                String name = scanner.nextLine();
                System.out.println("ch7al bghiti");
                float quantity = Float.parseFloat(scanner.nextLine());
                Product product = new Product(name, quantity);
                saveProduct(product, connection);
                shoppingList.addProduct(product);
                System.out.println("bghiti tchri " + shoppingList.toString());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    private static void saveProduct(Product product, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO product (name,quantity,shoping_list_id) values('"+product.getName()+"',"+product.getQuantity()+",1"+")");
    }
}

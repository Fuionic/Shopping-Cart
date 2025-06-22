package Cart;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        ShoppingCart cart = new ShoppingCart();

        store.addProduct(new Product(101, "T-Shirt", 499.00, 20));
        store.addProduct(new Product(102, "Laptop", 55000.00, 5));
        store.addProduct(new Product(103, "Smartphone", 22000.00, 8));
        store.addProduct(new Product(104	,"Bluetooth Speaker", 1500.00, 15));
        store.addProduct(new Product(105, "Wireless Mouse",	899.00, 25));
        store.addProduct(new Product(106, "Coffee Mug",	299.00, 30));
        store.addProduct(new Product(107	,"Notebook", 89.00, 50));
        store.addProduct(new Product(108	,"Backpack", 1299.00, 10));

        int choice;
        int id;
        String name;
        double price;
        int stock;

        Scanner sc = new Scanner(System.in);
        choice = 0;
        do{
            switch(choice){
                case 1:
                    store.display();
                    break;

                case 2:
                    System.out.print("Enter product ID to add: ");
                    id = sc.nextInt();

                    Product selectedProduct = store.getProductId(id); // Get product from store

                    if (selectedProduct == null) {
                        System.out.println("❌ Product not found with ID: " + id);
                    } else {
                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();

                        cart.addProduct(selectedProduct, quantity); // Add to cart
                    }
                    break;

                case 3:
                    cart.viewCart();
                    break;

                case 4:
                    System.out.println("Total Cart Price: ₹" + cart.getTotalCartPrice());
                    break;

                case 5:
                    System.out.println("Enter the product id to remove: ");
                    id = sc.nextInt();
                    cart.removeProduct(id);
                    break;

                case 6:
                    System.out.println("Happy Shopping");
                    break;
            }
            System.out.println("1) View Products \n 2) Add Product To Cart  \n" +
                    "3) View Cart \n 4) View Cart Price \n 5) Remove Product From Cart\n 6) Exit");
            choice = sc.nextInt();
        }while(choice != 6);
    }
}

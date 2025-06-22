package Cart;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem> cartItems;

    public ShoppingCart(){
        cartItems = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity){
        for(CartItem item: cartItems){
            if(item.getProduct().getid() == product.getid()){
                item.setQuantity(item.getQuantity()+quantity);
                System.out.println("Quantity updated in cart");
                return;
            }
        }

        cartItems.add(new CartItem(product, quantity));
        System.out.println("product added to cart");
    }

    public void removeProduct(int id){
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getProduct().getid() == id) {
                cartItems.remove(i);
                System.out.println("Product removed from cart.");
                return;
            }
        }
        System.out.println("Product not found in cart.");

    }

    public void viewCart(){
        if(cartItems.isEmpty()){
            System.out.println("Shop some goods :> ");
        }else{
            for(CartItem item : cartItems){
                item.display();
            }
        }
    }

    public double getTotalCartPrice(){
        double total = 0;
        for(CartItem item: cartItems){
            total = total + item.totalPrice();
        }
        return total;
    }
}

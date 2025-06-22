package Cart;

public class CartItem{
    int quantity;
    Product product;

    public CartItem(Product product, int quantity){
        this.quantity= quantity;
        this.product = product;
    }

    public Product getProduct(){
        return  product;
    }
    public void setProduct(Product product){
        this.product=product;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalPrice(){
        double total;
        total = product.getprice()* quantity;
        return total;
    }

    public void display() {
        System.out.println("Product: " + product.getName() +
                ", Qty: " + quantity +
                ", Total: ₹" + totalPrice());
    }
}

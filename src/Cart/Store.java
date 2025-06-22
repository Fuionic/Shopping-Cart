package Cart;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products;
    public Store(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
        System.out.println("Product is added");
    }

    public void display(){
        if(products.isEmpty()){
            System.out.println("No product is available");
        }else{
            for(Product p : products){
                p.display();
            }
        }
    }

    public Product getProductId(int id){
        for(Product p: products){
            if(p.getid() == id){
                return p;
            }
        }
        return null;
    }
}

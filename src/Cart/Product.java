package Cart;

public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name= name;
        this.price=price;
        this.stock= stock;
    }

    public String getName(){
        return name;
    }
    public int getid(){
        return id;
    }
    public double getprice(){
        return price;
    }
    public int getstock(){
        return stock;
    }

    public void setprice(double price){
        this.price = price;
    }
    public void setstock(int stock){
        this.stock = stock;
    }

    public void display(){
        System.out.println("product id = " + getid());
        System.out.println("product name = " + getName());
        System.out.println("product price = " + getprice());
        System.out.println("Units in Stock = " + getstock());
    }
}

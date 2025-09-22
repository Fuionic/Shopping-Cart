# 🛒 Shopping Cart Console Application

A simple Java-based console application that simulates a basic shopping cart system. This project was built to revise and strengthen core Java concepts like Object-Oriented Programming (OOP), collections, and console input/output handling.
I have design thiis as project to practice LLD (LOW LEVEL DESIGN) demonstrating oop concepts.

---

## 🚀 Features

- 📦 View available products in the store
- ➕ Add products to the shopping cart
- ❌ Remove products from the cart
- 🛍️ View cart items with quantities and total price
- 💰 Real-time cart total calculation
- 🧠 Clean class structure using OOP principles

---

## ⚙️ Low Level Design Approach
- **Product** → Represents an item (id, name, price)  
- **CartItem** → Links product with quantity  
- **Cart** → Holds multiple CartItems, supports add/remove/total operations  
- **User** → Owns a cart  
- **Main class** → Driver code for testing the shopping cart
---

## 🛠️ Technologies Used

- Java (Core)
- IntelliJ IDEA
- Git & GitHub

---
## 📈 Example Run

Added: iPhone (₹80,000)
Added: AirPods (₹15,000)
Removed: AirPods
Cart Total: ₹80,000 

---
##UML Diagram
```
classDiagram
    class Product {
        - int id
        - String name
        - double price
        + Product(int, String, double)
        + getId()
        + getName()
        + getPrice()
    }

    class CartItem {
        - Product product
        - int quantity
        + CartItem(Product, int)
        + getProduct()
        + getQuantity()
        + getTotalPrice()
    }

    class Cart {
        - List~CartItem~ items
        + addItem(Product, int)
        + removeItem(Product)
        + getTotalPrice()
        + viewCart()
    }

    class User {
        - int id
        - String name
        - Cart cart
        + User(int, String)
        + getCart()
    }

    Product <.. CartItem
    CartItem *-- Product
    Cart *-- CartItem
    User *-- Cart
```


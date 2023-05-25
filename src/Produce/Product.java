package Produce;

public class Product {
    public int id;
    public String productName;
    public int qty;
    public double price;

    public Product(int id, String productName, int qty, double price) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }
    public String checksoluong(){
        if (qty > 0) {
            System.out.println("Còn hàng");
        } else {
            System.out.println("Đã hết hàng");
        }
        return null;
    }
}

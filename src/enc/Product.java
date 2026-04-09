package enc;

import java.util.ArrayList;

public class Product {
    private int pid;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(int pid,String productName,double price,int quantity) {
        this.pid = pid;
        this.quantity = quantity;
        this.price = price;
        this.productName = productName;
    }

    private String productName;
    private double price;
    private int quantity;

    static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<Product>();
        list.add(new Product(1,"Mobile",20000,10));
        list.add(new Product(2,"Mobile",20000,10));
        list.add(new Product(3,"Mobile",20000,10));
        list.add(new Product(4,"Mobile",20000,10));
        list.add(new Product(5,"Mobile",20000,10));

        for(Product p:list){
            String result = String.format("\r%d\t%s\t\t%f\t%f\t%d",
                    p.getPid(),p.getProductName(),p.getPrice(),p.getQuantity());
        }
    }
}

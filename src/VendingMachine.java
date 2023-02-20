import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int maxCapacity;
    private List<Product> list = new ArrayList<>();

    public VendingMachine(int maxCapacity, List<Product> list) {
        this.maxCapacity = maxCapacity;
        this.list = list;
    }
    public VendingMachine(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void addProduct(Product product){
        if (list.size() < maxCapacity) {
            list.add(product);
        }
        else{
            System.out.println("The vending machine is full, you can't add products anymore");
        }
    }

    public Product getProductByName(String name) throws Exception {
        for (Product product: list) {
            if (product.getName().equals(name)){
                return product;
            }
        }
        throw new Exception("We didn't find this product");
    }

    public Product getProductByCost(double price) throws Exception {
        for (Product product: list) {
            if (product.getPrice() == price){
                return product;
            }
        }
        throw new Exception("We didn't find this product");
    }
}

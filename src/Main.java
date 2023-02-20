public class Main {
    public static void main(String[] args) {
        VendingMachine vendMach = new VendingMachine(10);
        vendMach.addProduct(new Product("Apple", 10));
        vendMach.addProduct(new Product("Orange", 12));
        vendMach.addProduct(new Product("Lemon", 11));
        vendMach.addProduct(new Product("Lime", 13));

        try {
            System.out.println(vendMach.getProductByName("Apple"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
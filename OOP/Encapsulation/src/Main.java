public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");               /* product.name = "Laptop"; */
        product.setId(1);
        product.setDescription("Lenovo Legion");
        product.setPrice(599);
        product.setStockAmount(3);
        System.out.println(product.getCode());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}
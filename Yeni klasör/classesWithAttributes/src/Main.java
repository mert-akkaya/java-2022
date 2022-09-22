public class Main {

    public static void main(String[] args) {
	  Product product = new Product();
	  product.setId(1);
	  product.setName("laptop");
	  product.setDescription("Asus laptop");
	  product.setPrice(3000);
	  product.setStock(3);
	  ProductManager productManager = new ProductManager();
	  productManager.Add(product);
	  System.out.println(product.getKod());
	  System.out.println(product.getId());
    }
}

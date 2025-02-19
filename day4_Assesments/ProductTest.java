package day4;

public class ProductTest {
    public static void main(String[] args) {
     
        ProductService ps = new ProductService();

       
        Product product = new Product(10,"box");
        Product product1 = new Product(11,"box1"); 
        
        
        
        String result = ps.addProduct(product);
        String result1= ps.addProduct(product1);
        
        System.out.println(result+" - succesfully added product");
        System.out.println(result1+" - succesfull added product");
       
        ps.listProducts();
        
       
        Product updatedProduct = new Product(10, "updatedBox");
        int updateResult = ps.updateProduct(updatedProduct);
        System.out.println("Update result: " + updateResult);
        
       
        ps.listProducts();
        
      
        Product retrievedProduct = ps.getProduct(10);
        System.out.println("Retrieved product: " + retrievedProduct);
        
  
        int deleteResult = ps.deleteProduct(product);
        System.out.println("Delete result: " + deleteResult);
        
        ps.listProducts();
    }
}

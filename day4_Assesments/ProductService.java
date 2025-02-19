package day4;
import java.util.ArrayList;
import java.util.List;


public class ProductService {
    static List<Product> plist = new ArrayList<>();
    
    public String addProduct(Product p) {
        plist.add(p);
        return "success";
    }
    
    public int deleteProduct(Product p) {
        if (plist.remove(p)) {
            return 1;
        }
        return 0; 
    }
    
    public int updateProduct(Product p) {
        for (int i = 0; i < plist.size(); i++) {
            if (plist.get(i).id.equals(p.id)) {
                plist.set(i, p);
                return 1; 
            }
        }
        return 0; 
    }
    
    public void listProducts() {
        plist.forEach(x -> System.out.println(x));
    }
    
    public Product getProduct(Integer id) {
        for (Product p : plist) {
            if (p.id.equals(id)) {
                return p;
            }
        }
        return null; 
    }
    
}

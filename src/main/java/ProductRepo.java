import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepo {

    private HashMap<String, Product> products = new HashMap<>();

    public ProductRepo(List<Product> products){
        for(Product p : products) this.products.putIfAbsent(p.getId(), p);
    }

    public Product get(String id){
        return products.get(id);
    }

    public List<Product> list(){
        return new ArrayList<>(products.values());
        /*
        ArrayList<Product> productArr = new ArrayList<>(products.size());
        productArr.addAll(products.values());
        return productArr;
        */
    }

}

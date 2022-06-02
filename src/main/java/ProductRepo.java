import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class ProductRepo {

    private HashMap<String, Product> products = new HashMap<>();

    public ProductRepo(List<Product> products){
        for(Product p : products) this.products.putIfAbsent(p.getId(), p);
    }

    public Optional<Product> get(String id){
        Optional<Product> productReturn = Optional.of(products.get(id));
        return productReturn;
    }

    public List<Product> list(){
        return new ArrayList<>(products.values());
    }

}

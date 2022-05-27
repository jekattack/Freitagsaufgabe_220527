import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderRepo {
    private HashMap<String, Order> orders = new HashMap<>();

    public OrderRepo(List<Order> orders){
        for(Order o : orders) this.orders.putIfAbsent(o.getId(), o);
    }

    public Order get(String id){
        return orders.get(id);
    }

    public List<Order> list(){
        return new ArrayList<>(orders.values());
        /*
        ArrayList<Product> productArr = new ArrayList<>(products.size());
        productArr.addAll(products.values());
        return productArr;
        */
    }

    public void add(Order newOrder){
        orders.putIfAbsent(newOrder.getId(), newOrder);
    }

}

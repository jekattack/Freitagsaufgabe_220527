import java.util.UUID;

public class Product {

    private String name;
    private String id;

    public Product(String name){
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

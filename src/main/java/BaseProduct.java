import java.util.UUID;

public class BaseProduct {

    String name;
    String id;

    public BaseProduct(String name){
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }


}

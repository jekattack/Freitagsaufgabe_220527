public class ProductFurniture extends BaseProduct implements Product{

    public ProductFurniture(String name) {
        super(name);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

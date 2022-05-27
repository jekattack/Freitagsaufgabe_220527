public class ProductElectronics extends BaseProduct implements Product{

    public ProductElectronics(String name) {
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

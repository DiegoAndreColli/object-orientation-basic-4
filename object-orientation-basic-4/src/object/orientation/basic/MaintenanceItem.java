package object.orientation.basic;

/**
 *
 * @author User
 */
public class MaintenanceItem {

    private final Product product;
    private final String serialNumber;
    //other attributes were omitted

    public MaintenanceItem(Product product, String serialNumber) {
        this.product = product;
        this.serialNumber = serialNumber;
    }

    public Product getProduct() {
        return product;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

}

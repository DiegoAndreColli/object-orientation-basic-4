package object.orientation.basic;

/**
 *
 * @author User
 */
public class MaintenanceLine {

    private final Product product;
    private final Integer quantity;
    private final String serialNumber;

    public MaintenanceLine(Product product, Integer quantity, String serialNumber) {
        this.product = product;
        this.quantity = quantity;
        this.serialNumber = serialNumber;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

}

package object.orientation.basic;

/**
 *
 * @author User
 */
public class ShippingLine {

    private final Product product;
    private final Integer quantity;
    private final String serialNumber;
    private final String action;

    public ShippingLine(String action, Product product, Integer quantity, String serialNumber) {
        this.action = action;
        this.product = product;
        this.quantity = quantity;
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getAction() {
        return action;
    }

}

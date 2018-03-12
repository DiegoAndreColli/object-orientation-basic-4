package object.orientation.basic;

/**
 *
 * @author User
 */
public class ConferableOrderLine {

    private final Product product;
    private final Integer quantity;
    private final String serialNumber;

    public ConferableOrderLine(Product product, Integer quantity, String serialNumber) {
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

}

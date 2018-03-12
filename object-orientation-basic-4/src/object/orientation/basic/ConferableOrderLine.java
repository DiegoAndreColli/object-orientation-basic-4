package object.orientation.basic;

/**
 *
 * @author User
 */
public class ConferableOrderLine {

    private final String serialNumber;
    private final Product product;
    private final Integer quantity;

    public ConferableOrderLine(String serialNumber, Product product, Integer quantity) {
        this.serialNumber = serialNumber;
        this.product = product;
        this.quantity = quantity;
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

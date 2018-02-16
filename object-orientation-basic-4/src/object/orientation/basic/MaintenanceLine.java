package object.orientation.basic;

/**
 *
 * @author User
 */
public class MaintenanceLine implements ConferableOrderLine {

    private final Product product;
    private final Integer quantity;

    public MaintenanceLine(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public Integer getQuantity() {
        return quantity;
    }

}

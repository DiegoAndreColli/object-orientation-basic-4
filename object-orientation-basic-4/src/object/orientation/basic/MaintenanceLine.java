package object.orientation.basic;

/**
 *
 * @author User
 */
public class MaintenanceLine {

    private final Product product;
    private final Integer quantity;

    public MaintenanceLine(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

}

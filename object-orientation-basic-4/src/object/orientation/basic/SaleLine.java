package object.orientation.basic;

/**
 *
 * @author User
 */
public class SaleLine {

    private final Product product;
    private final Integer quantity;

    public SaleLine(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Double getLineTotal() {
        return product.getPrice() * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

}

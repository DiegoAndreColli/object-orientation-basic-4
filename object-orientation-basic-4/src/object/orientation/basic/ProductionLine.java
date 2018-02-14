package object.orientation.basic;

/**
 *
 * @author User
 */
public class ProductionLine implements ConferableOrderLine {

    private final Product product;
    private final Integer quantity;

    public ProductionLine(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Double getLineTotal() {
        return product.getPrice() * quantity;
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

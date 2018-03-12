package object.orientation.basic;

/**
 *
 * @author User
 */
public class SaleLine {

    private final Product product;
    private final Integer quantity;
    private final Double price;

    public SaleLine(Product product, Integer quantity, Double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

}

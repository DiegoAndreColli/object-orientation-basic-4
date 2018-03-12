package object.orientation.basic;

/**
 *
 * @author User
 */
public class SaleItem {

    private final Product product;
    private final Double price;
    //other attributes were omitted

    public SaleItem(Product product, Double price) {
        this.product = product;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public Double getPrice() {
        return price;
    }

}

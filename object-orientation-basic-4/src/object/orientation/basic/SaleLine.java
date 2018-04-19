package object.orientation.basic;

/**
 *
 * @author User
 */
public class SaleLine implements ShippingLine {

    private final SaleItem item;
    private final Integer quantity;
    //other attributes were omitted

    public SaleLine(SaleItem item, Integer quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public SaleItem getItem() {
        return item;
    }

    @Override
    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public Product getProduct() {
        return this.item.getProduct();
    }

    @Override
    public String getAction() {
        return "Sale";
    }

}

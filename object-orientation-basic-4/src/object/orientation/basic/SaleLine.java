package object.orientation.basic;

/**
 *
 * @author User
 */
public class SaleLine {

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

    public Integer getQuantity() {
        return quantity;
    }

}

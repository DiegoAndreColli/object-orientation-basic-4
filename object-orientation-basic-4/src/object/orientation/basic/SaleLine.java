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

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String getSerialNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

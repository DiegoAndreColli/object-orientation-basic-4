package object.orientation.basic;

/**
 *
 * @author User
 */
public class MaintenanceLine implements ShippingLine{

    private final MaintenanceItem item;
    private final Integer quantity;
    //other attributes were omitted
    
    public MaintenanceLine(MaintenanceItem item) {
        this.item = item;
        this.quantity = 1;
    }

    public MaintenanceItem getItem() {
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

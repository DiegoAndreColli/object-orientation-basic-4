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

    @Override
    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String getSerialNumber() {
        return this.item.getSerialNumber();
    }

    @Override
    public Product getProduct() {
        return this.item.getProduct();
    }

    @Override
    public String getAction() {
        return "Maintenance";
    }

}

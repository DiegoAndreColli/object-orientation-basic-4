package object.orientation.basic;

/**
 *
 * @author User
 */
public class MaintenanceLine {

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

}

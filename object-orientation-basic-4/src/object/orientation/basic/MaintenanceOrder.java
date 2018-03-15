package object.orientation.basic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author User
 */
public class MaintenanceOrder implements ShippingOrder {
    private Calendar entryDate;
    private List<MaintenanceLine> maintenanceLines;

    public List<MaintenanceLine> getMaintenanceLines() {
        return maintenanceLines;
    }

    public void setMaintenanceLines(List<MaintenanceLine> maintenanceLines) {
        this.maintenanceLines = maintenanceLines;
    }

    @Override
    public List<ShippingLine> getShippingLines() {
        List<ShippingLine> lines = new ArrayList();
        for (MaintenanceLine line : maintenanceLines) {
            lines.add(new ShippingLine("Maintenance", line.getItem().getProduct(), line.getQuantity(), line.getItem().getSerialNumber()));
        }
        return lines;
    }
}

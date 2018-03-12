package object.orientation.basic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class MaintenanceOrder implements ConferableOrder {

    private List<MaintenanceLine> maintenanceLines;

    public List<MaintenanceLine> getMaintenanceLines() {
        return maintenanceLines;
    }

    public void setMaintenanceLines(List<MaintenanceLine> maintenanceLines) {
        this.maintenanceLines = maintenanceLines;
    }

    @Override
    public List<ConferableOrderLine> getConferableLines() {
        List<ConferableOrderLine> lines = new ArrayList();
        for (MaintenanceLine line : maintenanceLines) {
            lines.add(new ConferableOrderLine(line.getItem().getProduct(), line.getQuantity(), line.getItem().getSerialNumber()));
        }
        return lines;
    }
}

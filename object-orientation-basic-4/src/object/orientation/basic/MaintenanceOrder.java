package object.orientation.basic;

import java.util.List;

/**
 *
 * @author User
 */
public class MaintenanceOrder implements ConferableOrder {

    private List<MaintenanceLine> maintenanceLines;

    @Override
    public List<? extends ConferableOrderLine> getConferableLines() {
        return this.maintenanceLines;
    }

    public List<MaintenanceLine> getMaintenanceLines() {
        return maintenanceLines;
    }

    public void setMaintenanceLines(List<MaintenanceLine> maintenanceLines) {
        this.maintenanceLines = maintenanceLines;
    }

}

package object.orientation.basic;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author User
 */
public class MaintenanceOrder {

    private Calendar entryDate;
    private List<MaintenanceLine> maintenanceLines;
    //other attributes were omitted

    public List<MaintenanceLine> getMaintenanceLines() {
        return maintenanceLines;
    }

    public void setMaintenanceLines(List<MaintenanceLine> maintenanceLines) {
        this.maintenanceLines = maintenanceLines;
    }

}

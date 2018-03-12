package object.orientation.basic.examples;

import java.util.ArrayList;
import java.util.List;
import object.orientation.basic.Product;
import object.orientation.basic.SaleOrder;
import object.orientation.basic.MaintenanceLine;
import object.orientation.basic.MaintenanceOrder;
import object.orientation.basic.SaleLine;

/**
 *
 * @author User
 */
public class ObjectFactory {

    public static MaintenanceOrder getMaintenances() {
        MaintenanceOrder maintenance = new MaintenanceOrder();
        maintenance.setMaintenanceLines(getMaintenanceLines());
        return maintenance;
    }

    public static SaleOrder getProductions() {
        SaleOrder production = new SaleOrder();
        production.setSaleLines(getProductionLines());
        return production;
    }

    private static List<MaintenanceLine> getMaintenanceLines() {
        List<MaintenanceLine> list = new ArrayList<>();
        list.add(new MaintenanceLine(new Product("Microchip", 200.0), 10));
        list.add(new MaintenanceLine(new Product("Resistor", 1.20), 50));        
        list.add(new MaintenanceLine(new Product("Processor", 500d), 3));        
        return list;
    }

    private static List<SaleLine> getProductionLines() {
        List<SaleLine> list = new ArrayList<>();
        list.add(new SaleLine(new Product("Microchip", 200.0), 10));
        list.add(new SaleLine(new Product("Resistor", 2.20), 10));
        list.add(new SaleLine(new Product("Bicycle", 8000d), 2));
        list.add(new SaleLine(new Product("Processor", 500d), 3));
        return list;
    }
    
}

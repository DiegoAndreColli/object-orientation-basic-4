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
        list.add(new MaintenanceLine(new Product("Microchip"), "123456"));
        list.add(new MaintenanceLine(new Product("Resistor"), "789456"));
        list.add(new MaintenanceLine(new Product("Processor"), "456123"));        
        return list;
    }

    private static List<SaleLine> getProductionLines() {
        List<SaleLine> list = new ArrayList<>();
        list.add(new SaleLine(new Product("Microchip"), 10, 200.0));
        list.add(new SaleLine(new Product("Resistor"), 10, 2.20));
        list.add(new SaleLine(new Product("Bicycle"), 2, 8000d));
        list.add(new SaleLine(new Product("Processor"), 3, 500d));
        return list;
    }
    
}

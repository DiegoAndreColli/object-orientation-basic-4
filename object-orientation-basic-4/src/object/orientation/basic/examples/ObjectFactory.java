package object.orientation.basic.examples;

import java.util.ArrayList;
import java.util.List;
import object.orientation.basic.MaintenanceItem;
import object.orientation.basic.Product;
import object.orientation.basic.SaleOrder;
import object.orientation.basic.MaintenanceLine;
import object.orientation.basic.MaintenanceOrder;
import object.orientation.basic.SaleItem;
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
        list.add(new MaintenanceLine(new MaintenanceItem(new Product("Microchip"),"123456")));
        list.add(new MaintenanceLine(new MaintenanceItem(new Product("Resistor"),"789456")));
        list.add(new MaintenanceLine(new MaintenanceItem(new Product("Processor"),"456123")));        
        return list;
    }

    private static List<SaleLine> getProductionLines() {
        List<SaleLine> list = new ArrayList<>();
        list.add(new SaleLine(new SaleItem(new Product("Microchip"), 200.0), 10 ));
        list.add(new SaleLine(new SaleItem(new Product("Resistor"), 2.20), 10 ));
        list.add(new SaleLine(new SaleItem(new Product("Bicycle"), 8000d), 2 ));
        list.add(new SaleLine(new SaleItem(new Product("Processor"), 500d), 3 ));        
        return list;
    }
    
}

package object.orientation.basic.examples;

import java.util.ArrayList;
import java.util.List;
import object.orientation.basic.Product;
import object.orientation.basic.ProductionOrder;
import object.orientation.basic.ConferableOrderLine;
import object.orientation.basic.MaintenanceLine;
import object.orientation.basic.MaintenanceOrder;

/**
 *
 * @author User
 */
public class ObjectFactory {

    public static MaintenanceOrder getMaintenances() {
        MaintenanceOrder sale = new MaintenanceOrder();

        return sale;
    }

    public static ProductionOrder getProductions() {
        ProductionOrder sale = new ProductionOrder();

        return sale;
    }

    private static List<ConferableOrderLine> getItens() {
        List<ConferableOrderLine> list = new ArrayList<>();
        list.add(new MaintenanceLine(new Product("Bread", 0.20), 10));
        list.add(new MaintenanceLine(new Product("Lamp", 2.20), 7));
        list.add(new MaintenanceLine(new Product("Bicycle", 8000d), 1));
        list.add(new MaintenanceLine(new Product("Toothpaste", 5d), 3));
        return list;
    }

}

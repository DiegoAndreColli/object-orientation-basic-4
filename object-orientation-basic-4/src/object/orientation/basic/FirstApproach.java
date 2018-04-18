package object.orientation.basic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class FirstApproach {

    private final List<MaintenanceLine> maintenances= new ArrayList<>();
    private final List<SaleLine> sales = new ArrayList<>();

    public void addMaintenanceLine(MaintenanceLine line) {
        maintenances.add(line);
    }

    public void addSaleLine(SaleLine line) {
        sales.add(line);
    }

    public void showCheckList() {

        String headers = String.format("%-15s", "Type")
                .concat(String.format("%15s", "Quantity"))
                .concat(String.format("%5s", ""))
                .concat(String.format("%-40s", "Product"))
                .concat(String.format("%-30s", "Serial Number"));
        System.out.println(headers + "\n");

        showMaintenances(maintenances);

        showSales(sales);

        System.out.println(String.format("\nEnd"));
    }

    private void showSales(List<SaleLine> sales) {
        for (SaleLine sale : sales) {
            String line = String.format("%-15s", "Sale")
                    .concat(String.format("%15s", sale.getQuantity()))
                    .concat(String.format("%5s", ""))
                    .concat(String.format("%-40s", sale.getItem().getProduct().getName()))
                    .concat(String.format("%-30s", " - "));
            System.out.println(line);
        }
    }

    private void showMaintenances(List<MaintenanceLine> maintenances) {
        for (MaintenanceLine maintenance : maintenances) {
            String line = String.format("%-15s", "Maintenance")
                    .concat(String.format("%15s", maintenance.getQuantity()))
                    .concat(String.format("%5s", ""))
                    .concat(String.format("%-40s", maintenance.getItem().getProduct().getName()))
                    .concat(String.format("%-30s", maintenance.getItem().getSerialNumber()));
            System.out.println(line);
        }
    }
}

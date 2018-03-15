package object.orientation.basic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class FirstApproach {

    private final List<MaintenanceLine> maintenances;
    private final List<SaleLine> sales;

    public FirstApproach() {
        this.maintenances = new ArrayList<>();
        this.sales = new ArrayList<>();
    }

    public void addMaintenanceLines(List<MaintenanceLine> lines) {
        maintenances.addAll(lines);
    }

    public void addSaleLines(List<SaleLine> lines) {
        sales.addAll(lines);
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

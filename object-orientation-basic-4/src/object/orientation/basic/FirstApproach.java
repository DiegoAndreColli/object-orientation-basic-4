
package object.orientation.basic;

import java.util.List;

/**
 *
 * @author User
 */
public class FirstApproach {
 
    
    public void showCheckin(List<SaleOrder> sales, List<MaintenanceOrder> maintenances){
    
        String headers = String.format("%-15s", "Type")
                .concat(String.format("%15s", "Quantity"))
                .concat(String.format("%5s", ""))
                .concat(String.format("%-40s", "Product"))                
                .concat(String.format("%-30s", "Serial Number"));
                
        System.out.println(headers+"\n");
        
        for (MaintenanceOrder maintenance : maintenances) {
            showCheckin(maintenance);
        }
        
         for (SaleOrder sale : sales) {
            showCheckin(sale);
        }
        
        System.out.println(String.format("\nEnd"));
    }
    
    private void showCheckin(SaleOrder sales){
        for (SaleLine sale : sales.getSaleLines()) {
            String line = String.format("%-15s", "Sale")
                .concat(String.format("%15s", sale.getQuantity()))
                .concat(String.format("%5s", ""))
                .concat(String.format("%-40s", sale.getItem().getProduct().getName()))
                .concat(String.format("%-30s", " - "));
            
            System.out.println(line);
        }
    }
    
    private  void showCheckin(MaintenanceOrder maintenances){
        for (MaintenanceLine maintenance : maintenances.getMaintenanceLines()) {
            String line = String.format("%-15s", "Maintenance")
                .concat(String.format("%15s", maintenance.getQuantity()))
                .concat(String.format("%5s", ""))
                .concat(String.format("%-40s", maintenance.getItem().getProduct().getName()))
                .concat(String.format("%-30s", maintenance.getItem().getSerialNumber()));
            
            System.out.println(line);
        }
    }
    
}

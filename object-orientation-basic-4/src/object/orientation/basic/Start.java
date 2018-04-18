package object.orientation.basic;

import java.util.ArrayList;
import java.util.List;
import object.orientation.basic.examples.ObjectFactory;

/**
 *
 * @author User
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CheckList checkList = new CheckList();

        SaleOrder sale1 = ObjectFactory.getSales();
        checkList.addLines(sale1.getSaleLines());

        SaleOrder sale2 = ObjectFactory.getSales();
        checkList.addLines(sale2.getSaleLines());

        MaintenanceOrder maintenance = ObjectFactory.getMaintenances();
        checkList.addLines(maintenance.getMaintenanceLines());

//        checkList.showCheckList();        
        
        //first approach
        FirstApproach f = new FirstApproach();
        
        for (MaintenanceLine line : maintenance.getMaintenanceLines()) {
            f.addMaintenanceLine(line);
        }
        
        for (SaleLine line : sale1.getSaleLines()) {
            f.addSaleLine(line);
        }
        
        for (SaleLine line : sale2.getSaleLines()) {
            f.addSaleLine(line);
        }

        f.showCheckList();
    }

}

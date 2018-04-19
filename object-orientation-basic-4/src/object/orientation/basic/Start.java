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
        SaleOrder sale2 = ObjectFactory.getSales();
        MaintenanceOrder maintenance = ObjectFactory.getMaintenances();

        for (MaintenanceLine line : maintenance.getMaintenanceLines()) {
            checkList.addLine(line);
        }
        
        for (SaleLine line : sale1.getSaleLines()) {
            checkList.addLine(line);
        }
        
        for (SaleLine line : sale2.getSaleLines()) {
            checkList.addLine(line);
        }

        
        checkList.showCheckList();        
//        
//        //first approach
//        FirstApproach f = new FirstApproach();
//        
//        for (MaintenanceLine line : maintenance.getMaintenanceLines()) {
//            f.addMaintenanceLine(line);
//        }
//        
//        for (SaleLine line : sale1.getSaleLines()) {
//            f.addSaleLine(line);
//        }
//        
//        for (SaleLine line : sale2.getSaleLines()) {
//            f.addSaleLine(line);
//        }
//
//        f.showCheckList();
    }

}

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
        checkList.addItemsCheckList(sale1.getSaleLines());

        SaleOrder sale2 = ObjectFactory.getSales();
        checkList.addItemsCheckList(sale2.getSaleLines());

        MaintenanceOrder maintenance = ObjectFactory.getMaintenances();
        checkList.addItemsCheckList(maintenance.getMaintenanceLines());

        checkList.showCheckList();        
        
        //first approach
        FirstApproach f = new FirstApproach();
        f.addMaintenanceLines(maintenance.getMaintenanceLines());
        f.addSaleLines(sale1.getSaleLines());
        f.addSaleLines(sale2.getSaleLines());
        f.showCheckList();
    }

}

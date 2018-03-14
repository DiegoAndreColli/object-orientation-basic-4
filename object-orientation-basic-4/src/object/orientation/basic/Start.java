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

        SaleOrder sale1 = ObjectFactory.getProductions();
        checkList.addItemsCheckList(sale1);

        SaleOrder sale2 = ObjectFactory.getProductions();
        checkList.addItemsCheckList(sale2);

        MaintenanceOrder maintenance = ObjectFactory.getMaintenances();
        checkList.addItemsCheckList(maintenance);

        checkList.showCheckList();        
        
        //first approach
        List<MaintenanceOrder> maintenances = new ArrayList<>();
        List<SaleOrder> productions = new ArrayList<>();        
        maintenances.add(maintenance);
        productions.add(sale1);
        productions.add(sale2);
        
        FirstApproach f = new FirstApproach();
        f.showCheckin(productions, maintenances);
    }

}

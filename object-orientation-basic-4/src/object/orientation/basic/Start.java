package object.orientation.basic;

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

        SaleOrder production = ObjectFactory.getProductions();
        checkList.addItemsCheckList(production);

        MaintenanceOrder maintenance = ObjectFactory.getMaintenances();
        checkList.addItemsCheckList(maintenance);

        SaleOrder production2 = ObjectFactory.getProductions();
        checkList.addItemsCheckList(production2);

        checkList.showCheckList();
    }

}

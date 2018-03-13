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

        SaleOrder production2 = ObjectFactory.getProductions();
        checkList.addItemsCheckList(production2);

        MaintenanceOrder maintenance = ObjectFactory.getMaintenances();
        checkList.addItemsCheckList(maintenance);

        checkList.showCheckList();
    }

}

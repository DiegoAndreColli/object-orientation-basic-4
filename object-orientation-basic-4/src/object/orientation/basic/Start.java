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

        ProductionOrder production = ObjectFactory.getProductions();
        checkList.addItemsCheckList(production);

        MaintenanceOrder maintenance = ObjectFactory.getMaintenances();
        checkList.addItemsCheckList(maintenance);

        ProductionOrder production2 = ObjectFactory.getProductions();
        checkList.addItemsCheckList(production2);

        checkList.showCheckList();
    }

}

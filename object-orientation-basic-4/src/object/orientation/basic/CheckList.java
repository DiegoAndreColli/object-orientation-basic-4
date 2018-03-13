package object.orientation.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User
 */
public class CheckList {

    private final List<ConferableOrderLine> checkList;

    public CheckList() {
        this.checkList = new ArrayList<>();
    }

    public void addItemsCheckList(ConferableOrder order) {        
        checkList.addAll(order.getConferableLines());        
    }

    public void showCheckList() {
        String headers = String.format("%-15s", "Type")
                .concat(String.format("%15s", "Quantity"))
                .concat(String.format("%5s", ""))
                .concat(String.format("%-40s", "Product"))                
                .concat(String.format("%-30s", "Serial Number"));
                
        System.out.println(headers+"\n");
        
        checkList.sort((p1, p2) -> p1.getProduct().getName().compareTo(p2.getProduct().getName()));

        
        for (ConferableOrderLine check : checkList) {        
            
            String line = String.format("%-15s", check.getAction())
                .concat(String.format("%15s", check.getQuantity()))
                .concat(String.format("%5s", ""))
                .concat(String.format("%-40s", check.getProduct().getName()))
                .concat(String.format("%-30s", check.getSerialNumber()));
            
            System.out.println(line);
        }
        
            
        System.out.println(String.format("\nEnd"));
        
    }
}

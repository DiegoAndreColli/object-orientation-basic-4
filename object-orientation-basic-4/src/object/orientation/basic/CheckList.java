package object.orientation.basic;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class CheckList {

    private final Map<Product, Integer> checkList;

    public CheckList() {
        this.checkList = new HashMap<>();
    }

    public void addItemsCheckList(ConferableOrder order) {
        for (ConferableOrderLine line : order.getConferableLines()) {
            
            int actual = checkList.getOrDefault(line.getProduct(), 0);
            
            checkList.put(line.getProduct(), line.getQuantity()+actual);
        }
    }

    public void showCheckList() {
        String headers = String.format("%-40s", "Product")
                .concat(String.format("%15s", "Quantity"));
        
        System.out.println(headers+"\n");
        
        for (Map.Entry<Product, Integer> entry : checkList.entrySet()) {
            Product key = entry.getKey();
            Integer value = entry.getValue();

            String line = String.format("%-40s", key.getName())
                    .concat(String.format("%15s", value));
            
            System.out.println(line);
        }
            
        System.out.println(String.format("\nEnd"));
        
    }
}


package object.orientation.basic;

import java.util.List;

/**
 *
 * @author User
 */
public interface ConferableOrder {    
    public List<? extends ConferableOrderLine> getConferableLines();
}

package object.orientation.basic;

/**
 *
 * @author User
 */
public interface ShippingLine {

    Product getProduct();

    Integer getQuantity();

    String getAction();
    
    default String getSerialNumber(){
         return " - ";
    }
    
}

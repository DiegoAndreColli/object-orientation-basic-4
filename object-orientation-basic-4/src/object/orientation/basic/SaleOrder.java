package object.orientation.basic;

import java.util.List;

/**
 *
 * @author User
 */
public class SaleOrder {

    private Double total;
    private Double discount;
    private List<SaleLine> saleLines;
    //other attributes were omitted

    public List<SaleLine> getSaleLines() {
        return saleLines;
    }

    public void setSaleLines(List<SaleLine> saleLines) {
        this.saleLines = saleLines;
    }
}

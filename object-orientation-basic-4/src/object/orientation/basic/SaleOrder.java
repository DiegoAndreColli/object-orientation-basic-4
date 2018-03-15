package object.orientation.basic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class SaleOrder implements ShippingOrder {
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

    @Override
    public List<ShippingLine> getShippingLines() {
        List<ShippingLine> lines = new ArrayList();
        for (SaleLine line : saleLines) {
            lines.add(new ShippingLine("Sale", line.getItem().getProduct(), line.getQuantity(), " - "));
        }
        return lines;
    }
}

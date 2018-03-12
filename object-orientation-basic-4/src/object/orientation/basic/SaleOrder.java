package object.orientation.basic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class SaleOrder implements ConferableOrder {
    private Double total;
    private Double discount;
    private List<SaleLine> saleLines;

    public List<SaleLine> getSaleLines() {
        return saleLines;
    }

    public void setSaleLines(List<SaleLine> saleLines) {
        this.saleLines = saleLines;
    }

    @Override
    public List<ConferableOrderLine> getConferableLines() {
        List<ConferableOrderLine> lines = new ArrayList();
        for (SaleLine line : saleLines) {
            lines.add(new ConferableOrderLine("Sale", line.getItem().getProduct(), line.getQuantity(), " - "));
        }
        return lines;
    }
}

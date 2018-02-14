package object.orientation.basic;

import java.util.List;

/**
 *
 * @author User
 */
public class ProductionOrder implements ConferableOrder {

    private List<ProductionLine> productionLines;

    @Override
    public List<? extends ConferableOrderLine> getConferableLines() {
        return this.productionLines;
    }

    public List<ProductionLine> getProductionLines() {
        return productionLines;
    }

    public void setProductionLines(List<ProductionLine> productionLines) {
        this.productionLines = productionLines;
    }

}

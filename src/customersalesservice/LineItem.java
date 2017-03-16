package customersalesservice;

/**
 *
 * @author CPere
 */
public class LineItem {
    private double quantity;
    private Product product;

    public LineItem(String ProdId, double quantity, DataAccessStrategy db) {
        setQuantity(quantity);
        product = findProduct(ProdId, db);
        
    }

    public final Product findProduct(String ProdId, DataAccessStrategy db) {
        return db.findProduct(ProdId);
    }
    public final double getQuantity() {
        return quantity;
    }

    public final void setQuantity(double quantity) {
        if(quantity < 1 || quantity > 10 ) {
            throw new IllegalArgumentException();
        }
        this.quantity = quantity;
    }
  
    
    public final double calculateSubTotal(){
        return (product.getRetailPrice() * getQuantity());
    }
    
     public final double calculateDiscount(){
        return (product.getDiscount().getDiscount(product.getRetailPrice(), quantity));
    }
     
    public final String generateLineItem(){
        
        String line = "";
        line += product.getProductID() + "\t";
        line += product.getProductName() + "\t";
        line += product.getRetailPrice() + "\t";
        line += getQuantity() + "\t";
        line += calculateSubTotal() + "\t";
        line += calculateDiscount() + "\n";
        
        return line;
    }
    
    public final String generateLineItemHeading(){
        
        String line = "";
        line += "ID" + "\t";
        line += "Item" + "\t";
        line += "Price" + "\t";
        line += "Quantity" + "\t";
        line += "Sub Total" + "\t";
        line += "Discount" + "\n";
        
        return line;
                    
    }
    

}

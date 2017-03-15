package customersalesservice;

/**
 *
 * @author CPere
 */
public class LineItem {
    private double quantity;
    private Product product =  new Product();

    public LineItem(String ProdId, double quantity, DataAccessStrategy db) {
        setQuantity(quantity);
        product = findProduct(ProdId, db);
        
    }

    public LineItem() {
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
    
    public final String generateLineItem(){
        
        String line = "";
        line += product.getProductID() + "\t";
        line += product.getProductName() + "\t";
        line += product.getRetailPrice() + "\t";
        line += getQuantity() + "\t";
        line += calculateSubTotal() + "\t";
        line += product.getDiscount().getDiscount(product.getRetailPrice(), quantity) + "\n";
        
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
    
    public final String generateLineItemFooter(){
    
        String line = "";
        line += "Net Total: " + getTotalSaved();
        line += "Total Saved: " + getTotalDue();
        line += "Total Due: " + getTotalDue();
        
        return line;
    
    }
    
    public final double getNetTotal(){
    
        double temp = 0.00;
        
        return temp;
    
    }
    public final double getTotalSaved(){
    
        double temp = 0.00;
        
        return temp;
    
    }
    public final double getTotalDue(){
    
        double temp = 0.00;
        
        return temp;
    
    }
}

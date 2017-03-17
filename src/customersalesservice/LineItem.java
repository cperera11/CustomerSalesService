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
           
        String line = String.format("%5s %20s  %10s %15s %15s %20s\n" , product.getProductID(), product.getProductName(),
                                        String.format("%.2f",product.getRetailPrice()),getQuantity(),
                                        String.format("%.2f",calculateSubTotal()), String.format("%.2f",calculateDiscount()));
        return line;
        
    }
  
    public final String generateLineItemHeading(){
    
        String line = String.format("%5s %15s  %25s %15s %15s %15s\n" , "ID", "Item", "Price","Quantity","Sub Total", "Discount");
        return line;
                    
    }


}

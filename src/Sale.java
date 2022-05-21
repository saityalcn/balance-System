import java.util.ArrayList;
import java.sql.Timestamp;

public class Sale {
    public int ID;
    public Timestamp date;
    public double totalPrice;
    public int sellerID;
    public ArrayList<OrderItem> productsOfSale;
    public boolean isDeleted;
    
    public Sale(int sellerID){
        this.sellerID = sellerID;
        productsOfSale = new ArrayList<>();
        this.isDeleted = false;
    }
    
    public Sale(int ID, Timestamp date, double totalPrice, int sellerID,boolean isDeleted){
        this.ID = ID;
        this.date = date;
        this.totalPrice = totalPrice;
        this.sellerID = sellerID;
        this.isDeleted = isDeleted;
    }
    
    public Sale(Timestamp date, double totalPrice, int sellerID,boolean isDeleted){
        this.date = date;
        this.totalPrice = totalPrice;
        this.sellerID = sellerID;
        this.isDeleted = isDeleted;
    }
    
    public boolean addSale(){
        SalesDbHelper dbHelper = new SalesDbHelper();
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Sale sale = new Sale(now, 0, this.sellerID, false);
        dbHelper.addSale(sale);
        
        return false;
    }
    
    public boolean finalizeSale(){
        SalesDbHelper dbHelper = new SalesDbHelper();
        double sumOfTotalPrices = 0;
        for (OrderItem orderItem : this.productsOfSale){
            sumOfTotalPrices += orderItem.price*orderItem.amount;
        }
        
        this.totalPrice = sumOfTotalPrices;
        return dbHelper.updatePriceOfSale(this);
        // call increaseSoldCountOfEmployee
    }
    
    public void addOrderItemToSale(OrderItem oi){
        ProductOperations po = new ProductOperations();
        SalesDbHelper dbHelper = new SalesDbHelper();

        if(po.checkStock(oi.productID, oi.amount)){
            oi.saleID = ID;
            this.productsOfSale.add(oi);
            dbHelper.addOrderItem(oi);
            po.decreaseStock(oi.productID, oi.amount);
        }
        
    }
      
    public boolean refundOrderItem(int orderItemId, int orderID, int amount){
        SalesDbHelper dbHelper = new SalesDbHelper();
        OrderItem prevOi = dbHelper.getOrderItem(orderItemId);
        Sale sale = dbHelper.getSale(orderID);
        OrderItem oi = new OrderItem(orderID, prevOi.productID, -1*amount, true, prevOi.price, prevOi.cost);
        ProductOperations po = new ProductOperations(); 
        
        sale.addOrderItemToSale(oi);
        sale.finalizeSale();
        
        return dbHelper.addOrderItem(oi);
    }
}

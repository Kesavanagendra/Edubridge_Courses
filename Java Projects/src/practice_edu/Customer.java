package practice_edu;

class ItemOutOfStockException extends Exception{
    public ItemOutOfStockException(String s){
        super(s);
    }
}

class InSufficientBalance extends Exception{
    public InSufficientBalance(String s1){
        super(s1);
    }
}

class Item{
    int id;
    String name;
    String companyname;
    double price;
    boolean isInStock;

    public Item(int id, String name, String companyname, double price, boolean isInStock) {
        this.id = id;
        this.name = name;
        this.companyname = companyname;
        this.price = price;
        this.isInStock = isInStock;
    }
}

class ShoppingWebsite{

    public String purchaseItem(Item i, Customer c){

         try{

                if(i.isInStock == false){
                    throw new ItemOutOfStockException("Item is out of stock");
                }
                if((i.price < c.walletprice) && (i.isInStock == true)  ){
                    return "Order Successful";
                }
                else{
                    throw new InSufficientBalance("Customer wallet balance is not Sufficient");
                }

            }
            catch(Exception e){
                e.printStackTrace();
            }
       
        return null;
    }
}
public class Customer {
    int cid;
    String cname;
    double walletprice;
    String address;

    public Customer(int cid, String cname, double walletprice, String address){
        this.cid = cid;
        this.cname = cname;
        this.walletprice = walletprice;
        this.address = address; 

    }

    public static void main(String[] args) {
        
        Customer cob = new Customer(927392,"steve",5000.0,"USA");
        Item iob = new Item(27392, "T-shirt", "us-polo", 800, true);
        ShoppingWebsite sob = new ShoppingWebsite();
        String out = sob.purchaseItem(iob,cob);
        System.out.println(out);


    }
}



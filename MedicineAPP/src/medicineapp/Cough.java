package medicineapp;

public class Cough extends Medicine{
    
    public Cough(){
        this(new Cough());
    }
    
    public Cough(Cough e){
        this(e.getMedId(),e.getMedname(),e.getMdescription(),e.getMprice(),e.getMedQty());
    }
    
    public Cough(int id, String name, String des, double price, int qty){
        super(id, name, des, price, qty);
    }
    
    
    @Override
    public String toString() {
        return String.format("Medicine ID: %d, Medicine name: %s, Medicine Description: %s, Medicine price: %.2f, Stock: %d",super.getMedId(), super.getMedname(),super.getMdescription(),super.getMprice(),super.getMedQty());
    }
    
}

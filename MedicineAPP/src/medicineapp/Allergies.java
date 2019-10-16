package medicineapp;

public class Allergies extends Medicine{
    
    public Allergies(){
        this(new Allergies());
    }
    
    public Allergies(Allergies e){
        this(e.getMedId(),e.getMedname(),e.getMdescription(),e.getMprice(),e.getMedQty());
    }
    
    public Allergies(int id, String name, String des, double price, int qty){
        super(id, name, des, price, qty);
        
    }
    
    @Override
    public String toString() {
        return String.format("Medicine ID: %d, Medicine name: %s, Medicine Description: %s, Medicine price: %.2f, Stock: %d",super.getMedId(), super.getMedname(),super.getMdescription(),super.getMprice(),super.getMedQty());
    }
    
}

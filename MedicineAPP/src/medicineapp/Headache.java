package medicineapp;

public class Headache extends Medicine{
    
    public Headache(){
        this(new Headache());
    }
    
    public Headache(Headache e){
        this(e.getMedId(),e.getMedname(),e.getMdescription(),e.getMprice(),e.getMedQty());
    }
    
    public Headache(int id, String name, String des, double price, int qty){
        super(id, name, des, price, qty);
    }
    
    @Override
    public String toString() {
        return String.format("Medicine ID: %d, Medicine name: %s, Medicine Description: %s, Medicine price: %.2f, Stock: %d",super.getMedId(), super.getMedname(),super.getMdescription(),super.getMprice(),super.getMedQty());
    }
    
}

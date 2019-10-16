package medicineapp;


public class Orders {
    
    private int id;
    private int userId;
    private int medId;
    private String medName;
    private double price;
    private int qty;

    public Orders() {
    }

    public Orders(int id, int userId, int medId, String medName, double price, int qty) {
        this.id = id;
        this.userId = userId;
        this.medId = medId;
        this.medName = medName;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getMedId() {
        return medId;
    }

    public String getMedName() {
        return medName;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
    
    
    
}

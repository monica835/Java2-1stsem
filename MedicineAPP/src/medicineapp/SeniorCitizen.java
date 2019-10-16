package medicineapp;


public class SeniorCitizen extends Customer {

    public SeniorCitizen(){
        this(new SeniorCitizen());
    }
    
    public SeniorCitizen(SeniorCitizen e){
        this(e.getId(),e.getUserName(),e.getPassWord(),e.getAge());
    }
    
    public SeniorCitizen(int id, String uname, String pass, int age){
        super(id, uname, pass, age);
    }
    
    
    public void payWithDiscount(Pharmacy a, Users e){
        e.viewOrders(e, a);
        System.out.print("Enter order ID: ");
        int ID = input.nextInt();
        for(int i = 0; i<a.getOrderList().size();i++){
            if(a.getOrderList().get(i+1).getId() == ID && e.getId() == a.getOrderList().get(i+1).getUserId()){
                System.out.print("Enter money to pay: ");
                int money = input.nextInt();
                double change = money-(a.getOrderList().get(i+1).getPrice()*0.2);
                if(change == 0){
                    System.out.println("Thank you for paying your order! Your money is exact!");
                    a.getOrderList().remove(a.getOrderList().get(i+1));
                }
                else if(change > 0){
                    System.out.println("Thank you for paying your order! Your change is "+change);
                    a.getOrderList().remove(a.getOrderList().get(i+1));
                }
                else {
                    System.out.println("Insufficient money to pay!");
                }
            }
            else {
                System.out.println("Order ID doesn't exist!");
            } 
        }
    }

  
    
}

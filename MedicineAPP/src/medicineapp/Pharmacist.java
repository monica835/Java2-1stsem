package medicineapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Pharmacist extends Users{
    
    public Pharmacist(){
       
    }  
    
    public Pharmacist(String name, String password){
        super(name, password);
    }
    
    
    public Medicine addMedicine(Medicine e, Pharmacy a){
        int b = a.getMedicineList().size()+1;
        System.out.print("Enter Generic name: ");
        String gname = input.nextLine();
        System.out.print("Enter brand name: ");
        String bname = input.nextLine();
        System.out.print("Enter price: ");
        String price = input.nextLine();
        System.out.print("Enter stock: ");
        String qty = input.nextLine();
        System.out.println("Choose medicine type: \n1. Cough\n2. Allergies\n3. Headache\n4. Bodypain");
        int choice = input.nextInt();
        if(choice == 1){
            e = new Cough(b, gname,bname, Double.valueOf(price),Integer.valueOf(qty));
            return e;       
        }
        else if(choice == 2){
            e = new Allergies(b, gname,bname, Double.valueOf(price),Integer.valueOf(qty));
            return e;
        }
        else if(choice == 3){
            e = new Headache(b, gname,bname, Double.valueOf(price),Integer.valueOf(qty));
            return e;
        }
        
        else if(choice == 4){
            e = new BodyPain(b, gname,bname, Double.valueOf(price),Integer.valueOf(qty));
            return e;
        
        }
        else {
            System.out.println("Wrong choice!");
        }
        return e;
    }

    public Medicine removeMedicine(Medicine e, Pharmacy a){
        System.out.print("Input Medicine ID: ");
        int id = input.nextInt();
        a.getAdmin().viewMedicines(a);
        for(int i = 0; i<a.getMedicineList().size();i++){
            if(id == a.getMedicineList().get(i).getMedId()){
                e = a.getMedicineList().get(i);
                return e;
            }
        }
        return e;
    }
    
    public void viewAllOrders(Users e, Pharmacy a){
        System.out.printf("%10s %5s %10s %5s %10s %5s %20s %5s %15s %10s","Order ID","|","User ID","|","Medicine ID","|","Medicine Name","|","Medicine Price","|","Quantity");
        for(int i = 0; i<a.getOrderList().size(); i++){
            System.out.printf("%10s %5s %10s %5s %10s %5s %20s %5s %15s %10s\n",a.getOrderList().get(i).getId(),"|",a.getOrderList().get(i).getUserId(),"|",a.getOrderList().get(i).getMedId(),"|",a.getOrderList().get(i).getMedName(),"|",a.getOrderList().get(i).getPrice(),"|",a.getOrderList().get(i).getQty());
        }
    }
    
}
   



   

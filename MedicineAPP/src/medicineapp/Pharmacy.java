/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicineapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dinglasamo_sd2022
 */
public class Pharmacy {  
    ArrayList<Users> userList = new ArrayList<Users>();
    ArrayList<Orders> orderList = new ArrayList<Orders>();
    ArrayList<Medicine> medicineList = new ArrayList<Medicine>();
    Pharmacist admin = new Pharmacist("Monica","Dinglasa");

   
   
    public Pharmacy() {}
    
    public void addInfo(Pharmacy user){
         user.getUserList().add(new Adult(1, "Patchan", "Gwapoako", 19));
        user.getUserList().add(new Adult(2, "Patrick", "Pogiako", 19));
        user.getUserList().add(new SeniorCitizen(3, "Patik", "P@ssw0rd", 62));

//        for(int i = 0; i<user.getUserList().size();i++){
//            System.out.println("ID: "+user.getUserList().get(i).getId()+"Username: "+user.getUserList().get(i).getUserName() + "\nPassword: "+ user.getUserList().get(i).getPassWord());
//        }
        user.getMedicineList().add(new BodyPain(1, "Alaxan", "Body Pain", 8.25, 100));

        user.getMedicineList().add(new Allergies(4, "Cetirizine", "Allergies", 8, 50));


        user.getMedicineList().add(new Cough(7, "Carbocisteine", "Cough", 17, 50));


        user.getMedicineList().add(new Headache(10, "Paracetamol", "Headache", 6, 50));

    
    
    }

//    public String getPharmaname() {
//        return pharmaname;
//    }
//
//    public void setPharmaname(String pharmaname) {
//        this.pharmaname = pharmaname;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public List<Pharmacist> getPharmalist() {
//        return pharmalist;
//    }
//
//    public void setPharmalist(List<Pharmacist> pharmalist) {
//        this.pharmalist = pharmalist;
//    }
//
//    public List<Users> getAccounts() {
//        return Accounts;
//    }
//
//    public void setAccounts(List<Users> Accounts) {
//        this.Accounts = Accounts;
//    }
//
//   
// 
//    public Pharmacy(String pharmaname, String location) {
//        this.pharmaname = pharmaname;
//        this.location = location;
//    }
//
//  public void addpharmalist(Pharmacist pharmaA){
//      pharmalist.add(pharmaA);
//      System.out.println("do you want to add pharmalist");
//      
//  }  
//  
// public void displaypharmalist(){
//     System.out.println("here are the list of users.");
//     
// }

    public ArrayList<Users> getUserList() {
        return userList;
    }

    public ArrayList<Orders> getOrderList() {
        return orderList;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public Pharmacist getAdmin() {
        return admin;
    }
}

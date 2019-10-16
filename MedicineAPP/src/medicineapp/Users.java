/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicineapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dinglasamo_sd2022
 */
public class Users implements Login{
    Scanner input = new Scanner(System.in);
    private String userName;
    private String passWord;
    private int age;
    private int id;
    
    public Users(){}
    
    public Users(Users e){
        this(e.getId(),e.getUserName(),e.getPassWord(),e.getAge());
    }
    public Users(int id, String userName, String passWord, int age) {
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
        this.id = id;
    }
    
    public Users(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }
    
//    public Users(Users e){
//        this(e.getUserName(),e.getPassWord());
//    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public Users login(Users e, Pharmacy a) {
        int count = 0;
        System.out.print("Enter username: ");
        String uname = input.nextLine();
        for(int i = 0; i<a.getUserList().size();i++){
            if(uname.equals(a.getUserList().get(i).getUserName())){
                System.out.print("Enter password: ");
                String pass = input.nextLine();
                if(pass.equals(a.getUserList().get(i).getPassWord())){
                    e = a.getUserList().get(i);
                    return e;
                }
            }
            else {
                count++;
            }        
        }
        if(uname.equals(a.getAdmin().getUserName())){
            System.out.print("Enter password: ");
            String pass = input.nextLine();
            if(pass.equals(a.getAdmin().getPassWord())){
                e = a.getAdmin();
                return e;
            }
            
        }
        
        if(count == a.getUserList().size()){
            System.out.println("Error Logging in!");
        }
        
        
        return e;
    }

    @Override
    public Users register(Users e, Pharmacy a) {
        int size = a.getUserList().size()+1;
        System.out.print("Enter username: ");
        String uname = input.nextLine();
        System.out.print("Enter Password: ");
        String pass = input.nextLine();
        System.out.print("Enter age: ");
        String age = input.nextLine();
        if(Integer.valueOf(age)>=18 && Integer.valueOf(age)<=59){
            e = new Adult(size, uname, pass, Integer.valueOf(age));
            return e;
        }
        else if(Integer.valueOf(age)>=60){
            e = new SeniorCitizen(size, uname, pass, Integer.valueOf(age));
            return e;
        }
        else {
            System.out.println("Too young to register!");
        }
        return e;
    }

    @Override
    public void viewMedicines(Pharmacy a) {
        for(int i = 0; i<a.getMedicineList().size();i++){
            System.out.printf("[ Medicine ID: %d, Name: %s, Description: %s, Price: %.2f, Stock: %d ]\n",a.getMedicineList().get(i).getMedId(),a.getMedicineList().get(i).getMedname(),a.getMedicineList().get(i).getMdescription(),a.getMedicineList().get(i).getMprice(),a.getMedicineList().get(i).getMedQty());
        }
    }

    @Override
    public void viewOrders(Users e, Pharmacy a) {
        System.out.printf("%10s %5s %10s %5s %10s %5s %20s %5s %15s %10s\n","Order ID","|","User ID","|","Medicine ID","|","Medicine Name","|","Medicine Price","|","Quantity");
        for(int i = 0; i<a.getOrderList().size(); i++){
            if(a.getOrderList().get(i).getUserId() == e.getId()){
                System.out.printf("%10s %5s %10s %5s %10s %5s %20s %5s %15s %10s\n",a.getOrderList().get(i).getId(),"|",a.getOrderList().get(i).getUserId(),"|",a.getOrderList().get(i).getMedId(),"|",a.getOrderList().get(i).getMedName(),"|",a.getOrderList().get(i).getPrice(),"|",a.getOrderList().get(i).getQty());
            }
        } 
    }
    
    @Override
    public Users logout(Users e){
        e = new Users();
        return e;
    }
    
    public void orderMedicine(Pharmacy a, Users e){
        int orderId = a.getOrderList().size()+1;
        e.viewMedicines(a);
        System.out.print("Enter Medicine ID: ");
        int medid = input.nextInt();
        for(int i = 0; i<a.getMedicineList().size(); i++){
            if(a.getMedicineList().get(i).getMedId() == medid){
                System.out.print("Enter quantity: ");
                int qty = input.nextInt();
                if(qty <= a.getMedicineList().get(i).getMedQty()){
                    double price = qty*a.getMedicineList().get(i).getMprice();
                    Orders b = new Orders();
                    a.getOrderList().add(new Orders(orderId,e.getId(),a.getMedicineList().get(i).getMedId(),a.getMedicineList().get(i).getMedname(),price,qty) );
                    System.out.println("Successfully ordered!");
                }
                
                else{
                    System.out.println("Insufficient stock!");                
                }                               
            }                       
        }       
    }
    
    
    
    
    
}

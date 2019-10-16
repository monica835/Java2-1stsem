/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicineapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer extends Users  {
    
    public Customer(){
    }
    
    public Customer(Customer e){
        this(e.getId(),e.getUserName(),e.getPassWord(),e.getAge());
    
    }

    public Customer(int id, String userName, String passWord, int age) {
        super(id, userName, passWord, age);
    }
    
}
        
 



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicineapp;

/**
 *
 * @author dinglasamo_sd2022
 */
public interface Login {
    public Users login(Users e, Pharmacy a);
    public Users register(Users e, Pharmacy a);
    public void viewMedicines(Pharmacy a);
    public void viewOrders(Users e, Pharmacy a);
    public Users logout(Users e);
    
}

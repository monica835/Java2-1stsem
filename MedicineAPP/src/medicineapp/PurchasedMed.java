/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicineapp;

import java.util.ArrayList;

/**
 *
 * @author 2ndyrGroupB
 */
public class PurchasedMed {
    private int purchasedId;
    private int Qty;
    private String medpurchasedName;
    private double medpurchasePrice;
    private int userId;
    private int medId;
    ArrayList<PurchasedMed> purchasedList = new ArrayList<PurchasedMed>();
    
    public PurchasedMed(){
        this(new PurchasedMed());
    }
    
    public PurchasedMed(PurchasedMed e){
        this(e.getPurchasedId(),e.getUserId(),e.getMedId(),e.getMedpurchasedName(),e.getMedpurchasePrice(),e.getQty());
    }
    
    public PurchasedMed(int purchasedId,int userId , int medId,String medpurchasedName, double medpurchasePrice, int Qty) {
        this.purchasedId = purchasedId;
        this.medId = medId;
        this.Qty = Qty;
        this.medpurchasedName=medpurchasedName;
        this.medpurchasePrice = medpurchasePrice;
        this.userId=userId;
    }

    public int getPurchasedId() {
        return purchasedId;
    }

    public void setPurchasedId(int purchasedId) {
        this.purchasedId = purchasedId;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public double getMedpurchasePrice() {
        return medpurchasePrice;
    }

    public void setMedpurchasePrice(double medpurchasePrice) {
        this.medpurchasePrice = medpurchasePrice;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<PurchasedMed> getPurchasedList() {
        return purchasedList;
    }

    public void setPurchasedList(ArrayList<PurchasedMed> purchasedList) {
        this.purchasedList = purchasedList;
    }

    public String getMedpurchasedName() {
        return medpurchasedName;
    }

    public void setMedpurchasedName(String medpurchasedName) {
        this.medpurchasedName = medpurchasedName;
    }

    public int getMedId() {
        return medId;
    }

    public void setMedId(int medId) {
        this.medId = medId;
    }
    
    @Override
    public String toString() {
        return String.format("%10s %5s %20s %5s %20s %5s %15s %5s %10s", purchasedId , userId,medpurchasedName,medpurchasePrice,Qty);
    }
    
        
    
}

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
public class Medicine {

    private String medname;
    private double mprice;
    private String mdescription;
    private int medId;
    private int medQty;

    public Medicine() {
    }

    public Medicine(int medId, String medname, String mdescription, double mprice, int medQty) {
        this.medname = medname;
        this.mprice = mprice;
        this.mdescription = mdescription;
        this.medId = medId;
        this.medQty = medQty;
    }

    public Medicine(Medicine e) {
        this(e.getMedId(), e.getMedname(), e.getMdescription(), e.getMprice(), e.getMedQty());
    }

    public String getMedname() {
        return medname;
    }

    public void setMedname(String medname) {
        this.medname = medname;
    }

    public double getMprice() {
        return mprice;
    }

    public void setMprice(double mprice) {
        this.mprice = mprice;
    }

    public String getMdescription() {
        return mdescription;
    }

    public void setMdescription(String mdescription) {
        this.mdescription = mdescription;
    }

    public int getMedId() {
        return medId;
    }

    public void setMedId(int medId) {
        this.medId = medId;
    }

    public int getMedQty() {
        return medQty;
    }

    public void setMedQty(int medQty) {
        this.medQty = medQty;
    }

    @Override
    public String toString() {
        return String.format("Medicine ID: %d, Medicine name: %s, Medicine Description: %s, Medicine price: %.2f, Stock: %d",medId, medname,mdescription,mprice,medQty);
    }

    

}

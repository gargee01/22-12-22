package com.exercise.bll;

public class InvoiceItem {
    private String Id;
    private String Desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String Id, String Desc, int qty, double unitPrice) {
        this.Id = Id;
        this.Desc = Desc;
        this.qty = qty;
        this.unitPrice = unitPrice;

    }

    public String getId() {
        return Id;
    }

    public int getQty() {
        return qty;
    }

    public String getDesc() {
        return Desc;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;

    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String toString() {
        return "\nID = " + Id + " \nDesc = " + Desc + " \nQty = " + qty + " \nUnitPrice = " + unitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werkstuk.model;

/**
 */
public class Order_Product {
    private int ordernr;
    private int productnr;

    public int getOrdernr() {
        return ordernr;
    }

    public void setOrdernr(int ordernr) {
        this.ordernr = ordernr;
    }

    public int getProductnr() {
        return productnr;
    }

    public void setProductnr(int productnr) {
        this.productnr = productnr;
    }

    public Order_Product(int ordernr, int productnr) {
        this.ordernr = ordernr;
        this.productnr= productnr;
    }
    
    public String toString() {
        return Integer.toString(this.productnr);
    }
}

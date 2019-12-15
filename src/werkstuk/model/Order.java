/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werkstuk.model;

/**
 */
public class Order {
    private int ordernr;
    private int clientnr;
    private int suppliernr;

    public Order(int ordernr, int clientnr, int suppliernr) {
        this.ordernr = ordernr;
        this.clientnr = clientnr;
        this.suppliernr = suppliernr;
    }

    public int getClientnr() {
        return clientnr;
    }

    public void setClientnr(int clientnr) {
        this.clientnr = clientnr;
    }

    public int getSuppliernr() {
        return suppliernr;
    }

    public void setSuppliernr(int suppliernr) {
        this.suppliernr = suppliernr;
    }

    public int getOrdernr() {
        return ordernr;
    }

    public void setOrdernr(int ordernr) {
        this.ordernr = ordernr;
    }

    public String toString() {
        return Integer.toString(this.ordernr);
    }       
}
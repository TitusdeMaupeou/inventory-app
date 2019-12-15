/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werkstuk.model;

/**
 */
public class Supplier {
    private int suppliernr;
    private String firstname;
    private String lastname;
    private String address;

    public int getSuppliernr() {
        return suppliernr;
    }

    public void setSuppliernr(int suppliernr) {
        this.suppliernr = suppliernr;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Supplier(int suppliernr, String firstname, String lastname, String address) {
        this.suppliernr = suppliernr;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public String toString() {
        return this.firstname + " " + this.lastname;
    }
    
           
}
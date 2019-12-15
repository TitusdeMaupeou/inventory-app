/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werkstuk.model;

/**
 */
public class Product {
    private int productnr;
    private String name;
    private float prijs;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return prijs;
    }

    public void setPrice(int prijs) {
        this.prijs = prijs;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public int getProductnr() {
        return productnr;
    }

    public void setProductnr(int Productnr) {
        this.productnr = productnr;
    }

    public Product(int productnr, String name, float prijs, int stock) {
        this.productnr = productnr;
        this.name = name;
        this.prijs = prijs;
        this.stock = stock;
    }
    
    public String toString() {
        return this.name;
    }
           
}

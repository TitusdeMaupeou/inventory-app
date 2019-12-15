/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werkstuk.model;

/**
 *
 * @author Titus
 */
public class Product2 {
    private int productId;
    private String name;
    private int prijs;
    private int brandId;
    private int categoryId;
    private int winkelId; 

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getWinkelId() {
        return winkelId;
    }

    public void setWinkelId(int winkelId) {
        this.winkelId = winkelId;
    }

    public int getPrice() {
        return prijs;
    }

    public void setPrice(int prijs) {
        this.prijs = prijs;
    }

    public Product2(int productId, String name, int prijs, int brandId, int categoryId, int winkelId) {
        this.productId = productId;
        this.name = name;
        this.prijs = prijs;
        this.brandId = brandId;
        this.categoryId = categoryId;
        this.winkelId = winkelId;
    }
}

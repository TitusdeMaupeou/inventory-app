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
public class Orderlist {
    private int shoppinglistId;
    private int productId;
    private int ownerId;
    private int amount;
    
    public int getOrderlistId() {
        return shoppinglistId;
    }

    public void setOrderlistId(int shoppinglistId) {
        this.shoppinglistId = shoppinglistId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Orderlist(int shoppinglistId, int productId, int ownerId, int amount) {
        this.shoppinglistId = shoppinglistId;
        this.productId = productId;
        this.ownerId = ownerId;
        this.amount = amount;
    }
}

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
public class Category {
    private int categoryId;
    private String categoryname;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public Category(int categoryId, String categoryname) {
        this.categoryId = categoryId;
        this.categoryname = categoryname;
    }

}

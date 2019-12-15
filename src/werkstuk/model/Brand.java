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
public class Brand {
    private int brandId;
    private String name;
    private String headquarters;

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public Brand(int brandId, String name, String headquarters) {
        this.brandId = brandId;
        this.name = name;
        this.headquarters = headquarters;
    }
    
}

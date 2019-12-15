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
public class Owner {
    private int ownerId;
    private String firstname;
    private String lastname;

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
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

    public Owner(int ownerId, String firstname, String lastname) {
        this.ownerId = ownerId;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}

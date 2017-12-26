/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author cory4
 */
@Entity
@Table(name = "REGISTER")
public class User implements Serializable {
    private String purpose, name, surname, email, password,cnp, phone;
    @Id
    private Long id;

    public User() {
    }
    
    public User(String purpose, String name, String surname, String email,
    String password, String cnp, String phone) {
    this.purpose = purpose;
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.password = password;
    this.cnp = cnp;
    this.phone = phone;
    }
    public Long getId() {
        return id;
    }
    public String getPurpose() {
        return purpose;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getCnp() {
        return cnp;
    }
    public String getPhone() {
        return phone;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}

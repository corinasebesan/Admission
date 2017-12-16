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
    private static String purpose, name, surname, email, password,cnp, phone;
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
    public static String getPurpose() {
        return purpose;
    }
    public static String getName() {
        return name;
    }
    public static String getSurname() {
        return surname;
    }
    public static String getEmail() {
        return email;
    }
    public static String getPassword(){
        return password;
    }
    public static String getCnp() {
        return cnp;
    }
    public static String getPhone() {
        return phone;
    }
}

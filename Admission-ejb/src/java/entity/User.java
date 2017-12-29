/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author cory4
 */
@Entity
@Table(name = "REGISTER")
@NamedQueries({@NamedQuery(name="User.getAll",query="SELECT e FROM User e"),
@NamedQuery(name="User.getNameByEmailAndPassword",query="SELECT u.name FROM User u WHERE u.email= :email AND u.password= :password")})
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int iduser;
    @Column
    private String purpose;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String cnp;
    @Column
    private String phone;

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
    public int getId() {
        return iduser;
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

    public void setId(int iduser) {
        this.iduser = iduser;
    }
    
}

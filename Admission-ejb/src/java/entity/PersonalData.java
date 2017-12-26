/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 *
 * @author cory4
 */
@Entity
@Table(name = "PERSONAL")
public class PersonalData implements Serializable{
    private String father, previous_name, sex, birthdate, county, city, serie, number, issued_by, issued_at, expires_at;
    private User user;
    @Id
    private Long id;

    public PersonalData() {
    }

    public PersonalData(String father, String previous_name, String sex, String birthdate, String county, String city, String serie, String number, String issued_by, String issued_at, String expires_at, Long id) {
        this.father = father;
        this.previous_name = previous_name;
        this.sex = sex;
        this.birthdate = birthdate;
        this.county = county;
        this.city = city;
        this.serie = serie;
        this.number = number;
        this.issued_by = issued_by;
        this.issued_at = issued_at;
        this.expires_at = expires_at;
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFather() {
        return father;
    }

    public String getPrevious_name() {
        return previous_name;
    }

    public String getSex() {
        return sex;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getCounty() {
        return county;
    }

    public String getCity() {
        return city;
    }

    public String getSerie() {
        return serie;
    }

    public String getNumber() {
        return number;
    }

    public String getIssued_by() {
        return issued_by;
    }

    public String getIssued_at() {
        return issued_at;
    }

    public String getExpires_at() {
        return expires_at;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public void setPrevious_name(String previous_name) {
        this.previous_name = previous_name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setIssued_by(String issued_by) {
        this.issued_by = issued_by;
    }

    public void setIssued_at(String issued_at) {
        this.issued_at = issued_at;
    }

    public void setExpires_at(String expires_at) {
        this.expires_at = expires_at;
    }
    @OneToOne

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}

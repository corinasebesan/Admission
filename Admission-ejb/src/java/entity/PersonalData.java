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
@Table(name = "PERSONAL")
@NamedQueries(@NamedQuery(name="PersonalData.getAll",query="SELECT e FROM PersonalData e"))
public class PersonalData implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private Long idper;
    @Column
    private String father; 
    @Column
    private String previous_name;
    @Column
    private String sex;
    @Column
    private String birthdate;
    @Column
    private String county;
    @Column
    private String city; 
    @Column
    private String serie;
    @Column
    private String number;
    @Column
    private String issued_by;
    @Column
    private String issued_at;
    @Column
    private String expires_at;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String cnp;

    public PersonalData() {
    }

    public PersonalData(String father, String previous_name, String sex, String birthdate, String county, String city, String serie, String number, String issued_by, String issued_at, String expires_at, String name, String surname, String cnp) {
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
        this.name=name;
        this.surname=surname;
        this.cnp=cnp;
    }
    
    public Long getId() {
        return idper;
    }

    public void setId(Long idper) {
        this.idper = idper;
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCnp() {
        return cnp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    
}

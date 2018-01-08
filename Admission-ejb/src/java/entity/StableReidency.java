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
@Table(name = "RESIDENCE")
@NamedQueries(@NamedQuery(name="StableReidency.getAll",query="SELECT e FROM StableReidency e"))
public class StableReidency implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int idres;
    @Column
    private String county;
    @Column
    private String city;
    @Column
    private String postal_code;
    @Column
    private String street;
    @Column
    private String house_number;
    @Column
    private String block;
    @Column
    private String stair;
    @Column
    private String floor;
    @Column
    private String appartament;

    public StableReidency() {
    }

    public StableReidency(String county, String city, String postal_code, String street, String house_number, String block, String stair, String floor, String appartament) {
        this.county = county;
        this.city = city;
        this.postal_code = postal_code;
        this.street = street;
        this.house_number = house_number;
        this.block = block;
        this.stair = stair;
        this.floor = floor;
        this.appartament = appartament;
    }
    
    public int getId() {
        return idres;
    }

    public void setId(int idres) {
        this.idres = idres;
    }

    public String getCounty() {
        return county;
    }

    public String getCity() {
        return city;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse_number() {
        return house_number;
    }

    public String getBlock() {
        return block;
    }

    public String getStair() {
        return stair;
    }

    public String getFloor() {
        return floor;
    }

    public String getAppartament() {
        return appartament;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public void setStair(String stair) {
        this.stair = stair;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setAppartament(String appartament) {
        this.appartament = appartament;
    }
    
}

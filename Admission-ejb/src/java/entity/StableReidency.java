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
@Table(name = "RESIDENCE")
public class StableReidency implements Serializable {
    private String county,city,postal_code,street,house_number,block,stair,floor,appartament;
    @Id
    private Long id;

    public StableReidency() {
    }

    public StableReidency(String county, String city, String postal_code, String street, String house_number, String block, String stair, String floor, String appartament, Long id) {
        this.county = county;
        this.city = city;
        this.postal_code = postal_code;
        this.street = street;
        this.house_number = house_number;
        this.block = block;
        this.stair = stair;
        this.floor = floor;
        this.appartament = appartament;
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
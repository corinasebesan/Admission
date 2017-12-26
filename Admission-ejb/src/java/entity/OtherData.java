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
@Table(name = "OTHERS")
public class OtherData implements Serializable {
    private String civil_state,natinality,ethnicity,citizenship,previous_citizenship,special_social,handicaped;
    @Id
    private Long id;

    public OtherData() {
    }

    public OtherData(String civil_state, String natinality, String ethnicity, String citizenship, String previous_citizenship, String special_social, String handicaped, Long id) {
        this.civil_state = civil_state;
        this.natinality = natinality;
        this.ethnicity = ethnicity;
        this.citizenship = citizenship;
        this.previous_citizenship = previous_citizenship;
        this.special_social = special_social;
        this.handicaped = handicaped;
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCivil_state() {
        return civil_state;
    }

    public String getNatinality() {
        return natinality;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public String getPrevious_citizenship() {
        return previous_citizenship;
    }

    public String getSpecial_social() {
        return special_social;
    }

    public String getHandicaped() {
        return handicaped;
    }

    public void setCivil_state(String civil_state) {
        this.civil_state = civil_state;
    }

    public void setNatinality(String natinality) {
        this.natinality = natinality;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public void setPrevious_citizenship(String previous_citizenship) {
        this.previous_citizenship = previous_citizenship;
    }

    public void setSpecial_social(String special_social) {
        this.special_social = special_social;
    }

    public void setHandicaped(String handicaped) {
        this.handicaped = handicaped;
    }
    
}

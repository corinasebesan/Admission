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
@Table(name = "OTHERS")
@NamedQueries(@NamedQuery(name="OtherData.getAll",query="SELECT e FROM OtherData e"))
public class OtherData implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private Long idoth;
    @Column
    private String civil_state;
    @Column
    private String nationality;
    @Column
    private String ethnicity;
    @Column
    private String citizenship;
    @Column
    private String previous_citizenship;
    @Column
    private String special_social;
    @Column
    private String handicaped;
    
    public OtherData() {
    }

    public OtherData(String civil_state, String nationality, String ethnicity, String citizenship, String previous_citizenship, String special_social, String handicaped) {
        this.civil_state = civil_state;
        this.nationality = nationality;
        this.ethnicity = ethnicity;
        this.citizenship = citizenship;
        this.previous_citizenship = previous_citizenship;
        this.special_social = special_social;
        this.handicaped = handicaped;
    }
    
    public Long getId() {
        return idoth;
    }

    public void setId(Long idoth) {
        this.idoth = idoth;
    }

    public String getCivil_state() {
        return civil_state;
    }

    public String getNationality() {
        return nationality;
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

    public void setNationality(String nationality) {
        this.nationality = nationality;
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

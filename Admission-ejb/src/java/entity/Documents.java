/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.sql.Blob;
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
@Table(name = "DOCUMENTS")
@NamedQueries(@NamedQuery(name="Documents.getAll",query="SELECT e FROM Documents e"))
public class Documents implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column 
    private int iddoc;
    @Column
    private String type;
    @Column
    private Blob bac_diploma;
    @Column
    private Blob birth_certificate;
    @Column
    private Blob medical_certificate;
    @Column
    private Blob id;
    @Column
    private Blob previous_college;
    @Column
    private Blob bachelor_diploma;
    @Column
    private Blob diploma_supplement;
    @Column
    private Blob previous_experience;

    public Documents() {
    }

    public Documents(String type, Blob bac_diploma, Blob birth_certificate, Blob medical_certificate, Blob id, Blob previous_college, Blob bachelor_diploma, Blob diploma_supplement,Blob previous_experience) {
        this.type = type;
        this.bac_diploma = bac_diploma;
        this.birth_certificate = birth_certificate;
        this.medical_certificate = medical_certificate;
        this.id = id;
        this.previous_college = previous_college;
        this.bachelor_diploma = bachelor_diploma;
        this.diploma_supplement = diploma_supplement;
        this.previous_experience=previous_experience;
    }

    public int getIddoc() {
        return iddoc;
    }

    public String getType() {
        return type;
    }

    public Blob getBac_diploma() {
        return bac_diploma;
    }

    public Blob getBirth_certificate() {
        return birth_certificate;
    }

    public Blob getMedical_certificate() {
        return medical_certificate;
    }

    public Blob getId() {
        return id;
    }

    public Blob getPrevious_college() {
        return previous_college;
    }

    public Blob getBachelor_diploma() {
        return bachelor_diploma;
    }

    public Blob getDiploma_supplement() {
        return diploma_supplement;
    }

    public void setIddoc(int iddoc) {
        this.iddoc = iddoc;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBac_diploma(Blob bac_diploma) {
        this.bac_diploma = bac_diploma;
    }

    public void setBirth_certificate(Blob birth_certificate) {
        this.birth_certificate = birth_certificate;
    }

    public void setMedical_certificate(Blob medical_certificate) {
        this.medical_certificate = medical_certificate;
    }

    public void setId(Blob id) {
        this.id = id;
    }

    public void setPrevious_college(Blob previous_college) {
        this.previous_college = previous_college;
    }

    public void setBachelor_diploma(Blob bachelor_diploma) {
        this.bachelor_diploma = bachelor_diploma;
    }

    public void setDiploma_supplement(Blob diploma_supplement) {
        this.diploma_supplement = diploma_supplement;
    }

    public Blob getPrevious_experience() {
        return previous_experience;
    }

    public void setPrevious_experience(Blob previous_experience) {
        this.previous_experience = previous_experience;
    }
    
    
}

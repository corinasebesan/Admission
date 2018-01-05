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
@Table(name = "ACCOUNT")
@NamedQueries(@NamedQuery(name="CountDetails.getAll",query="SELECT e FROM CountDetails e"))
public class CountDetails implements Serializable {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   @Column 
   private int idacc;
   @Column
    private String form;
    @Column
    private String exist;

    public CountDetails() {
    }

    public CountDetails(int idacc, String form, String exist) {
        this.idacc=idacc;
        this.form = form;
        this.exist = exist;
    }

    public int getIdacc() {
        return idacc;
    }

    public String getForm() {
        return form;
    }

    public String getExist() {
        return exist;
    }

    public void setIdacc(int idacc) {
        this.idacc = idacc;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setExist(String exist) {
        this.exist = exist;
    }
    
}

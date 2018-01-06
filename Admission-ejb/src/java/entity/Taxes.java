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
@Table(name = "DOCUMENTS")
@NamedQueries(@NamedQuery(name="Taxes.getAll",query="SELECT e FROM Taxes e"))
public class Taxes implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column 
    private int idtax;
    @Column
    private String payment;

    public Taxes() {
    }

    public Taxes(String payment) {
        this.payment = payment;
    }

    public int getIdtax() {
        return idtax;
    }

    public String getPayment() {
        return payment;
    }

    public void setIdtax(int idtax) {
        this.idtax = idtax;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
    
}

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
@Table(name = "SESSION")
@NamedQueries({@NamedQuery(name="AdmissionSession.getAll",query="SELECT e FROM AdmissionSession e"),
@NamedQuery(name="AdmissionSession.getAllSessionsAndSpecialtys",query="SELECT f.sessions,f.specialty FROM AdmissionSession f")})
public class AdmissionSession implements Serializable {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   @Column 
   private int idses;
   @Column
   private String sessions;
   @Column
   private String specialty;

    public AdmissionSession() {
    }

    public AdmissionSession(String sessions, String specialty) {
        this.sessions = sessions;
        this.specialty = specialty;
    }

    public int getIdses() {
        return idses;
    }

    public String getSessions() {
        return sessions;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setIdses(int idses) {
        this.idses = idses;
    }

    public void setSessions(String sessions) {
        this.sessions = sessions;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
   
}

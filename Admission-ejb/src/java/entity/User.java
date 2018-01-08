/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author cory4
 */
@Entity
@Table(name = "REGISTER")
@NamedQueries({@NamedQuery(name="User.getAll",query="SELECT e FROM User e"),
@NamedQuery(name="User.getNameByEmailAndPassword",query="SELECT u.name FROM User u WHERE u.email= :email AND u.password= :password")})
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int iduser;
    @Column
    private String purpose;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String cnp;
    @Column
    private String phone;
    @OneToOne
    private PersonalData PersonalData;
    @OneToOne
    private UniversityEducation UniversityEducation;
    @OneToOne
    private HighschoolEducation HighschoolEducation;
    @OneToOne
    private OtherData OtherData;
    @OneToOne
    private StableReidency StableReidency;
    @OneToOne
    private Taxes Taxes;
    @OneToOne
    private Documents Documents;
    @OneToMany
    private Collection<CountDetails>CountDetails;
    @OneToMany
    private Collection<AdmissionSession>AdmissionSession;

    public User() {
    }
    
    public User(String purpose, String name, String surname, String email,
    String password, String cnp, String phone) {
    this.purpose = purpose;
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.password = password;
    this.cnp = cnp;
    this.phone = phone;
    }
    public int getId() {
        return iduser;
    }
    public String getPurpose() {
        return purpose;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getCnp() {
        return cnp;
    }
    public String getPhone() {
        return phone;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(int iduser) {
        this.iduser = iduser;
    }

    public PersonalData getPersonalData() {
        return PersonalData;
    }

    public UniversityEducation getUniversityEducation() {
        return UniversityEducation;
    }

    public HighschoolEducation getHighschoolEducation() {
        return HighschoolEducation;
    }

    public OtherData getOtherData() {
        return OtherData;
    }

    public StableReidency getStableReidency() {
        return StableReidency;
    }

    public Taxes getTaxes() {
        return Taxes;
    }

    public Documents getDocuments() {
        return Documents;
    }

    public Collection<CountDetails> getCountDetails() {
        return CountDetails;
    }

    public Collection<AdmissionSession> getAdmissionSession() {
        return AdmissionSession;
    }

    public void setPersonalData(PersonalData PersonalData) {
        this.PersonalData = PersonalData;
    }

    public void setUniversityEducation(UniversityEducation UniversityEducation) {
        this.UniversityEducation = UniversityEducation;
    }

    public void setHighschoolEducation(HighschoolEducation HighschoolEducation) {
        this.HighschoolEducation = HighschoolEducation;
    }

    public void setOtherData(OtherData OtherData) {
        this.OtherData = OtherData;
    }

    public void setStableReidency(StableReidency StableReidency) {
        this.StableReidency = StableReidency;
    }

    public void setTaxes(Taxes Taxes) {
        this.Taxes = Taxes;
    }

    public void setDocuments(Documents Documents) {
        this.Documents = Documents;
    }

    public void setCountDetails(Collection<CountDetails> CountDetails) {
        this.CountDetails = CountDetails;
    }

    public void setAdmissionSession(Collection<AdmissionSession> AdmissionSession) {
        this.AdmissionSession = AdmissionSession;
    }
    
    
    
}

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
@Table(name = "UNIVERSITY")
@NamedQueries(@NamedQuery(name="UniversityEducation.getAll",query="SELECT e FROM UniversityEducation e"))
public class UniversityEducation implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int iduniv;
    @Column
    private String county;
    @Column
    private String domain;
    @Column
    private String duration; 
    @Column
    private String educational_form;
    @Column
    private String exam_average;
    @Column
    private String faculty;
    @Column
    private String financial_form;
    @Column
    private String graduation;
    @Column
    private String issue_year;
    @Column
    private String issuer; 
    @Column
    private String number;
    @Column
    private String serie;
    @Column
    private String specialty;
    @Column
    private String title;
    @Column
    private String transcript_number;
    @Column
    private String type; 
    @Column
    private String university;
    @Column
    private String years_average; 

    public UniversityEducation() {
    }
    
    public UniversityEducation(String county, String university, String domain, String faculty, String specialty, String title, String educational_form, String financial_form, String duration, String graduation, String exam_average, String years_average, String type, String issuer, String serie, String number, String issue_year, String transcript_number) {
        this.county = county;
        this.university = university;
        this.domain = domain;
        this.faculty = faculty;
        this.specialty = specialty;
        this.title = title;
        this.educational_form = educational_form;
        this.financial_form = financial_form;
        this.duration = duration;
        this.graduation = graduation;
        this.exam_average = exam_average;
        this.years_average = years_average;
        this.type = type;
        this.issuer = issuer;
        this.serie = serie;
        this.number = number;
        this.issue_year = issue_year;
        this.transcript_number = transcript_number;
    }
    
    public int getId() {
        return iduniv;
    }
    
    public void setId(int iduniv) {
        this.iduniv = iduniv;
    }

    public String getCounty() {
        return county;
    }

    public String getUniversity() {
        return university;
    }

    public String getDomain() {
        return domain;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getTitle() {
        return title;
    }

    public String getEducational_form() {
        return educational_form;
    }

    public String getFinancial_form() {
        return financial_form;
    }

    public String getDuration() {
        return duration;
    }

    public String getGraduation() {
        return graduation;
    }

    public String getExam_average() {
        return exam_average;
    }

    public String getYears_average() {
        return years_average;
    }

    public String getType() {
        return type;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getSerie() {
        return serie;
    }

    public String getNumber() {
        return number;
    }

    public String getIssue_year() {
        return issue_year;
    }

    public String getTranscript_number() {
        return transcript_number;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEducational_form(String educational_form) {
        this.educational_form = educational_form;
    }

    public void setFinancial_form(String financial_form) {
        this.financial_form = financial_form;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public void setExam_average(String exam_average) {
        this.exam_average = exam_average;
    }

    public void setYears_average(String years_average) {
        this.years_average = years_average;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setIssue_year(String issue_year) {
        this.issue_year = issue_year;
    }

    public void setTranscript_number(String transcript_number) {
        this.transcript_number = transcript_number;
    }
    
}

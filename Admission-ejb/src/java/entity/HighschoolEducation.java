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
import javax.persistence.Table;
/**
 *
 * @author cory4
 */
@Entity
@Table(name = "HIGHSCHOOL")
public class HighschoolEducation implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String highschool_county;
    @Column
    private String graduated_highschool;
    @Column
    private String section;
    @Column
    private String form;
    @Column
    private String duration;
    @Column
    private String graduation;
    @Column
    private String highschool_average;
    @Column
    private String bac_year;
    @Column
    private String bac_average;
    @Column
    private String type;
    @Column
    private String issuer;
    @Column
    private String diploma_serie;
    @Column
    private String diploma_number;
    @Column
    private String issue_year;
    @Column
    private String transcript_number; 

    public HighschoolEducation() {
    }

    public HighschoolEducation(String highschool_county, String graduated_highschool, String section, String form, String duration, String graduation, String highschool_average, String bac_year, String bac_average, String type, String issuer, String diploma_serie, String diploma_number, String issue_year, String transcript_number, Long id) {
        this.highschool_county = highschool_county;
        this.graduated_highschool = graduated_highschool;
        this.section = section;
        this.form = form;
        this.duration = duration;
        this.graduation = graduation;
        this.highschool_average = highschool_average;
        this.bac_year = bac_year;
        this.bac_average = bac_average;
        this.type = type;
        this.issuer = issuer;
        this.diploma_serie = diploma_serie;
        this.diploma_number = diploma_number;
        this.issue_year = issue_year;
        this.transcript_number = transcript_number;
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHighschool_county() {
        return highschool_county;
    }

    public String getGraduated_highschool() {
        return graduated_highschool;
    }

    public String getSection() {
        return section;
    }

    public String getForm() {
        return form;
    }

    public String getDuration() {
        return duration;
    }

    public String getGraduation() {
        return graduation;
    }

    public String getHighschool_average() {
        return highschool_average;
    }

    public String getBac_year() {
        return bac_year;
    }

    public String getBac_average() {
        return bac_average;
    }

    public String getType() {
        return type;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getDiploma_serie() {
        return diploma_serie;
    }

    public String getDiploma_number() {
        return diploma_number;
    }

    public String getIssue_year() {
        return issue_year;
    }

    public String getTranscript_number() {
        return transcript_number;
    }

    public void setHighschool_county(String highschool_county) {
        this.highschool_county = highschool_county;
    }

    public void setGraduated_highschool(String graduated_highschool) {
        this.graduated_highschool = graduated_highschool;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public void setHighschool_average(String highschool_average) {
        this.highschool_average = highschool_average;
    }

    public void setBac_year(String bac_year) {
        this.bac_year = bac_year;
    }

    public void setBac_average(String bac_average) {
        this.bac_average = bac_average;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public void setDiploma_serie(String diploma_serie) {
        this.diploma_serie = diploma_serie;
    }

    public void setDiploma_number(String diploma_number) {
        this.diploma_number = diploma_number;
    }

    public void setIssue_year(String issue_year) {
        this.issue_year = issue_year;
    }

    public void setTranscript_number(String transcript_number) {
        this.transcript_number = transcript_number;
    }
    
}

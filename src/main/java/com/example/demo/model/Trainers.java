/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Basic;
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
 * @author stkou
 */
@Entity
@Table(name = "trainers")
@NamedQueries({
    @NamedQuery(name = "Trainers.findAll", query = "SELECT t FROM Trainers t"),
    @NamedQuery(name = "Trainers.findByTrid", query = "SELECT t FROM Trainers t WHERE t.trid = :trid"),
    @NamedQuery(name = "Trainers.findByTrainerFname", query = "SELECT t FROM Trainers t WHERE t.trainerFname = :trainerFname"),
    @NamedQuery(name = "Trainers.findByTrainerLname", query = "SELECT t FROM Trainers t WHERE t.trainerLname = :trainerLname"),
    @NamedQuery(name = "Trainers.findBySubject", query = "SELECT t FROM Trainers t WHERE t.subject = :subject")})
public class Trainers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trid")
    private Integer trid;
    @Column(name = "trainer_fname")
    private String trainerFname;
    @Column(name = "trainer_lname")
    private String trainerLname;
    @Column(name = "subject")
    private String subject;

    public Trainers() {
    }

    public Trainers(String trainerFname, String trainerLname, String subject) {
        this.trainerFname = trainerFname;
        this.trainerLname = trainerLname;
        this.subject = subject;
    }

    
    
    public Trainers(Integer trid) {
        this.trid = trid;
    }

    public Integer getTrid() {
        return trid;
    }

    public void setTrid(Integer trid) {
        this.trid = trid;
    }

    public String getTrainerFname() {
        return trainerFname;
    }

    public void setTrainerFname(String trainerFname) {
        this.trainerFname = trainerFname;
    }

    public String getTrainerLname() {
        return trainerLname;
    }

    public void setTrainerLname(String trainerLname) {
        this.trainerLname = trainerLname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trid != null ? trid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainers)) {
            return false;
        }
        Trainers other = (Trainers) object;
        if ((this.trid == null && other.trid != null) || (this.trid != null && !this.trid.equals(other.trid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trainers{trid=").append(trid);
        sb.append(", trainerFname=").append(trainerFname);
        sb.append(", trainerLname=").append(trainerLname);
        sb.append(", subject=").append(subject);
        sb.append('}');
        return sb.toString();
    }
  
}

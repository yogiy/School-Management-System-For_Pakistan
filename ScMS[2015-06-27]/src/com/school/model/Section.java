package com.school.model;
// Generated Dec 9, 2014 7:01:06 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

/**
 * Section generated by hbm2java
 */
@Entity
@Table(name="section"
    
)
public class Section  implements java.io.Serializable {


     private Integer sectionId;
     private String name;
     private String remarks;
     private Set<Classes> classeses = new HashSet<Classes>(0);
     private Set<Designation> designations = new HashSet<Designation>(0);

    public Section() {
    }

	
    public Section(String name) {
        this.name = name;
    }
    public Section(String name, String remarks, Set classeses, Set designations) {
       this.name = name;
       this.remarks = remarks;
       this.classeses = classeses;
       this.designations = designations;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="section_id", unique=true, nullable=false)
    public Integer getSectionId() {
        return this.sectionId;
    }
    
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }
    
    @Column(name="name", nullable=false, length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="remarks", length=200)
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="section")
@OrderBy("sequenceNo")    
public Set<Classes> getClasseses() {
        return this.classeses;
    }
    
    public void setClasseses(Set classeses) {
        this.classeses = classeses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="section")
    public Set<Designation> getDesignations() {
        return this.designations;
    }
    
    public void setDesignations(Set designations) {
        this.designations = designations;
    }

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }




}



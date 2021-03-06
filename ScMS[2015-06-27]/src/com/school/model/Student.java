package com.school.model;
// Generated Dec 9, 2014 7:01:06 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name="student"
    , uniqueConstraints = @UniqueConstraint(columnNames="gr_no") 
)
public class Student  implements java.io.Serializable {


     private Integer studentId;
     private int grNo;
     private String studentName;
     private String fatherName;
     private String surname;
     private String religion;
     private Date dateOfBirth;
     private String placeOfBirth;
     private Date dateOfAddmission;
     private Date dateOfLeaving;
     private String lastSchool;
     private String remarks;
     private String contactNo;
     private String fatherContactNo;
     private String address;
     private String occupation;
     private String nic;
     private String gender;
     private String perminantAddress;
     private String fatherQualification;
     private String motherName;
     private String motherQualification;
     private String motherOccupation;
     private String formNo;
     private String telNo;
     private Boolean oneMonth;
     private String progress;
     private String cond;
     private Set<StudentAttachment> studentAttachments = new HashSet<StudentAttachment>(0);
     private Set<FeesDiscount> feesDiscounts = new HashSet<FeesDiscount>(0);
     private Set<StudentClassReg> studentClassRegs = new HashSet<StudentClassReg>(0);
     private Set<StudentCertificateIssue> studentCertificateIssues = new HashSet<StudentCertificateIssue>(0);
     private Set<Awards> awardses = new HashSet<Awards>(0);
     private Set<SmsHistory> smsHistories = new HashSet<SmsHistory>(0);

     private String lastClassName;
     
     public Student() {
    }

	
    public Student(int grNo, String studentName, String fatherName, String surname, String contactNo, String gender) {
        this.grNo = grNo;
        this.studentName = studentName;
        this.fatherName = fatherName;
        this.surname = surname;
        this.contactNo = contactNo;
        this.gender = gender;
    }
    public Student(int grNo, String studentName, String fatherName, String surname, String religion, Date dateOfBirth, String placeOfBirth, Date dateOfAddmission, Date dateOfLeaving, String lastSchool, String remarks, String contactNo, String fatherContactNo, String address, String occupation, String nic, String gender, String perminantAddress, String fatherQualification, String motherName, String motherQualification, String motherOccupation, String formNo, String telNo, Boolean oneMonth, String progress, String cond, Set studentAttachments, Set feesDiscounts, Set studentClassRegs, Set studentCertificateIssues, Set awardses, Set smsHistories) {
       this.grNo = grNo;
       this.studentName = studentName;
       this.fatherName = fatherName;
       this.surname = surname;
       this.religion = religion;
       this.dateOfBirth = dateOfBirth;
       this.placeOfBirth = placeOfBirth;
       this.dateOfAddmission = dateOfAddmission;
       this.dateOfLeaving = dateOfLeaving;
       this.lastSchool = lastSchool;
       this.remarks = remarks;
       this.contactNo = contactNo;
       this.fatherContactNo = fatherContactNo;
       this.address = address;
       this.occupation = occupation;
       this.nic = nic;
       this.gender = gender;
       this.perminantAddress = perminantAddress;
       this.fatherQualification = fatherQualification;
       this.motherName = motherName;
       this.motherQualification = motherQualification;
       this.motherOccupation = motherOccupation;
       this.formNo = formNo;
       this.telNo = telNo;
       this.oneMonth = oneMonth;
       this.progress = progress;
       this.cond = cond;
       this.studentAttachments = studentAttachments;
       this.feesDiscounts = feesDiscounts;
       this.studentClassRegs = studentClassRegs;
       this.studentCertificateIssues = studentCertificateIssues;
       this.awardses = awardses;
       this.smsHistories = smsHistories;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="student_id", unique=true, nullable=false)
    public Integer getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    
    @Column(name="gr_no", unique=true, nullable=false)
    public int getGrNo() {
        return this.grNo;
    }
    
    public void setGrNo(int grNo) {
        this.grNo = grNo;
    }
    
    @Column(name="student_name", nullable=false, length=100)
    public String getStudentName() {
        return this.studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    @Column(name="father_name", nullable=false, length=100)
    public String getFatherName() {
        return this.fatherName;
    }
    
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    
    @Column(name="surname", nullable=false, length=40)
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    @Column(name="religion", length=30)
    public String getReligion() {
        return this.religion;
    }
    
    public void setReligion(String religion) {
        this.religion = religion;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="date_of_birth", length=10)
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Column(name="place_of_birth", length=100)
    public String getPlaceOfBirth() {
        return this.placeOfBirth;
    }
    
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="date_of_addmission", length=10)
    public Date getDateOfAddmission() {
        return this.dateOfAddmission;
    }
    
    public void setDateOfAddmission(Date dateOfAddmission) {
        this.dateOfAddmission = dateOfAddmission;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="date_of_leaving", length=10)
    public Date getDateOfLeaving() {
        return this.dateOfLeaving;
    }
    
    public void setDateOfLeaving(Date dateOfLeaving) {
        this.dateOfLeaving = dateOfLeaving;
    }
    
    @Column(name="last_school", length=100)
    public String getLastSchool() {
        return this.lastSchool;
    }
    
    public void setLastSchool(String lastSchool) {
        this.lastSchool = lastSchool;
    }
    
    @Column(name="remarks", length=100)
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    @Column(name="contact_no", nullable=false, length=20)
    public String getContactNo() {
        return this.contactNo;
    }
    
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    
    @Column(name="father_contact_no", length=30)
    public String getFatherContactNo() {
        return this.fatherContactNo;
    }
    
    public void setFatherContactNo(String fatherContactNo) {
        this.fatherContactNo = fatherContactNo;
    }
    
    @Column(name="address", length=200)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Column(name="occupation", length=200)
    public String getOccupation() {
        return this.occupation;
    }
    
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    @Column(name="nic", length=20)
    public String getNic() {
        return this.nic;
    }
    
    public void setNic(String nic) {
        this.nic = nic;
    }
    
    @Column(name="gender", nullable=false, length=10)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Column(name="perminant_address", length=200)
    public String getPerminantAddress() {
        return this.perminantAddress;
    }
    
    public void setPerminantAddress(String perminantAddress) {
        this.perminantAddress = perminantAddress;
    }
    
    @Column(name="father_qualification", length=200)
    public String getFatherQualification() {
        return this.fatherQualification;
    }
    
    public void setFatherQualification(String fatherQualification) {
        this.fatherQualification = fatherQualification;
    }
    
    @Column(name="mother_name", length=100)
    public String getMotherName() {
        return this.motherName;
    }
    
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
    
    @Column(name="mother_qualification", length=100)
    public String getMotherQualification() {
        return this.motherQualification;
    }
    
    public void setMotherQualification(String motherQualification) {
        this.motherQualification = motherQualification;
    }
    
    @Column(name="mother_occupation", length=100)
    public String getMotherOccupation() {
        return this.motherOccupation;
    }
    
    public void setMotherOccupation(String motherOccupation) {
        this.motherOccupation = motherOccupation;
    }
    
    @Column(name="form_no", length=100)
    public String getFormNo() {
        return this.formNo;
    }
    
    public void setFormNo(String formNo) {
        this.formNo = formNo;
    }
    
    @Column(name="tel_no", length=100)
    public String getTelNo() {
        return this.telNo;
    }
    
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    
    @Column(name="one_month")
    public Boolean getOneMonth() {
        return this.oneMonth;
    }
    
    public void setOneMonth(Boolean oneMonth) {
        this.oneMonth = oneMonth;
    }
    
    @Column(name="progress", length=100)
    public String getProgress() {
        return this.progress;
    }
    
    public void setProgress(String progress) {
        this.progress = progress;
    }
    
    @Column(name="cond", length=100)
    public String getCond() {
        return this.cond;
    }
    
    public void setCond(String cond) {
        this.cond = cond;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="student")
    public Set<StudentAttachment> getStudentAttachments() {
        return this.studentAttachments;
    }
    
    public void setStudentAttachments(Set<StudentAttachment> studentAttachments) {
        this.studentAttachments = studentAttachments;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="student")
    public Set<FeesDiscount> getFeesDiscounts() {
        return this.feesDiscounts;
    }
    
    public void setFeesDiscounts(Set feesDiscounts) {
        this.feesDiscounts = feesDiscounts;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="student")
@OrderBy("studentClassRegId")
    public Set<StudentClassReg> getStudentClassRegs() {
        return this.studentClassRegs;
    }
    
    public void setStudentClassRegs(Set studentClassRegs) {
        this.studentClassRegs = studentClassRegs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="student")
    public Set<StudentCertificateIssue> getStudentCertificateIssues() {
        return this.studentCertificateIssues;
    }
    
    public void setStudentCertificateIssues(Set studentCertificateIssues) {
        this.studentCertificateIssues = studentCertificateIssues;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="student")
    public Set<Awards> getAwardses() {
        return this.awardses;
    }
    
    public void setAwardses(Set awardses) {
        this.awardses = awardses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="student")
    public Set<SmsHistory> getSmsHistories() {
        return this.smsHistories;
    }
    
    public void setSmsHistories(Set smsHistories) {
        this.smsHistories = smsHistories;
    }

    public String getLastClassName() {
        return lastClassName;
    }

    public void setLastClassName(String lastClassName) {
        this.lastClassName = lastClassName;
    }


 @Override
    public String toString() {
        return studentName; //To change body of generated methods, choose Tools | Templates.
    }


}



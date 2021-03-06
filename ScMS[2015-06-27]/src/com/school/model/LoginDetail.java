package com.school.model;
// Generated Dec 9, 2014 7:01:06 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LoginDetail generated by hbm2java
 */
@Entity
@Table(name="login_detail"
)
public class LoginDetail  implements java.io.Serializable {


     private Integer loginDetailId;
     private Date loginDate;
     private String action;
     private int userId;
     private Date loginTime;

    public LoginDetail() {
    }

    public LoginDetail(Date loginDate, String action, int userId, Date loginTime) {
       this.loginDate = loginDate;
       this.action = action;
       this.userId = userId;
       this.loginTime = loginTime;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="login_detail_id", unique=true, nullable=false)
    public Integer getLoginDetailId() {
        return this.loginDetailId;
    }
    
    public void setLoginDetailId(Integer loginDetailId) {
        this.loginDetailId = loginDetailId;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="login_date", nullable=false, length=10)
    public Date getLoginDate() {
        return this.loginDate;
    }
    
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
    
    @Column(name="action", nullable=false, length=50)
    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }
    
    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    @Temporal(TemporalType.TIME)
    @Column(name="login_time", nullable=false, length=8)
    public Date getLoginTime() {
        return this.loginTime;
    }
    
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }




}



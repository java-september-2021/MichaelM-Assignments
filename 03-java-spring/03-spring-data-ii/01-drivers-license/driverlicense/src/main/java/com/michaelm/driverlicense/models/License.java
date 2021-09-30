package com.michaelm.driverlicense.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="licenses")
public class License {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Integer number;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date experationDate;
    private String state;
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_id")
    private Person person;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    @PrePersist
    protected void onCreate() {
   	this.createdAt = new Date();
   }
    
   @PreUpdate
   protected void onUpdate() {
   	
   }

public License() {
	
}

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Integer getNumber() {
	return number;
}

public void setNumber(Integer number) {
	this.number = number;
}

public Date getExperationDate() {
	return experationDate;
}

public void setExperationDate(Date experationDate) {
	this.experationDate = experationDate;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public Date getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}

public Date getUpdatedAt() {
	return updatedAt;
}

public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}
public String returnLicenseNumbers() {
	int numberOfZeros = 7 - Integer.toString(this.number).length();
	StringBuilder sb = new StringBuilder();
	for(int i = 0; i < numberOfZeros; i++) {
		sb.append(0);
	}
	return String.format("%s%d", sb,this.number);
}
   

}


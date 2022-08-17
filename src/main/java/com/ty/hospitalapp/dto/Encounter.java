package com.ty.hospitalapp.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Encounter {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String name;
	@CreationTimestamp
	private LocalDateTime timeOfAdmission;

	public Encounter() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getTimeOfAdmission() {
		return timeOfAdmission;
	}

	public void setTimeOfAdmission(LocalDateTime timeOfAdmission) {
		this.timeOfAdmission = timeOfAdmission;
	}

	public MedOrder getMedOrder() {
		return medOrder;
	}

	public void setMedOrder(MedOrder medOrder) {
		this.medOrder = medOrder;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@OneToMany
	private MedOrder medOrder;
	@ManyToOne
	private Branch branch;
	@ManyToOne
	private Person person;
}

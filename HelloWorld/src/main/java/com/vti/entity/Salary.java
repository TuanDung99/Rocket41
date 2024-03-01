package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "Salary")
public class Salary implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "SalaryID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "SalaryName", length = 50, nullable = false)
	@Convert(converter = SalaryNameConverter.class)
	private SalaryName name;
	
	
	public Salary() {
	}
	

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public SalaryName getName() {
		return name;
	}

	public void setName(SalaryName name) {
		this.name = name;
	}
	

	
	@Override
	public String toString() {
		return "Posittion [id=" + id + ", name=" + name + "]";
	}
	public enum SalaryName {
		DEV("600"), TEST("700"), SCRUMMASTER("1500"), PM("2000");

		private String salaryName;

		private SalaryName(String salaryName) {
			this.salaryName = salaryName;
		}

		public String getSalaryName() {
			return salaryName;
		}

		public static SalaryName toEnum(String sqlSalaryName) {
			for (SalaryName s : SalaryName.values()) {
				if (s.getSalaryName().equals(sqlSalaryName)) {
					return s;
				}
			}
			return null;
		}
	}
}
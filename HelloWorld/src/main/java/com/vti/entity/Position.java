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
@Table(name = "`Position`")
public class Position implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "PositionID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "PositionName", length = 50, nullable = false)
	@Convert(converter = PositionNameConverter.class)
	private PositionName name;
	
	
	public Position() {
	}
	

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public PositionName getName() {
		return name;
	}

	public void setName(PositionName name) {
		this.name = name;
	}
	

	
	@Override
	public String toString() {
		return "Posittion [id=" + id + ", name=" + name + "]";
	}
	public enum PositionName {
		DEV("Dev"), TEST("Test"), SCRUMMASTER("ScrumMaster"), PM("PM");

		private String positionName;

		private PositionName(String positionName) {
			this.positionName = positionName;
		}

		public String getPositionName() {
			return positionName;
		}

		public static PositionName toEnum(String sqlPositionName) {
			for (PositionName p : PositionName.values()) {
				if (p.getPositionName().equals(sqlPositionName)) {
					return p;
				}
			}
			return null;
		}
	}
}
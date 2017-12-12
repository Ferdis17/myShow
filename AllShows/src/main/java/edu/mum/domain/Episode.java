package edu.mum.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Episode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String episodeName;
	
	@NotEmpty(message = "{NotEmpty.validation}")
	@Column(name="content", columnDefinition="TEXT")
	private String description;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfAired;
	
	private String Cast;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEpisodeName() {
		return episodeName;
	}

	public void setEpisodeName(String episodeName) {
		this.episodeName = episodeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateOfAired() {
		return dateOfAired;
	}

	public void setDateOfAired(Date dateOfAired) {
		this.dateOfAired = dateOfAired;
	}

	public String getCast() {
		return Cast;
	}

	public void setCast(String cast) {
		Cast = cast;
	}
	
	
	

}

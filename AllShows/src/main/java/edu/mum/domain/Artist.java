package edu.mum.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Artist {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int artistId;
	
	@NotEmpty(message = "{NotEmpty.validation}")
	private String placeOfBirth;
	
	@NotEmpty(message = "{NotEmpty.validation}")
    @Column(name="content", columnDefinition="TEXT")
	private String biography;
	
	private MultipartFile profilePicture;
}

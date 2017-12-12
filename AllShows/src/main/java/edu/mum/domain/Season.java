package edu.mum.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import net.minidev.json.annotate.JsonIgnore;

@Entity
public class Season {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty(message = "{NotEmpty.validation}")
	private String seasonNumber;
	
	@NotEmpty(message = "{NotEmpty.validation}")
	@Column(name="content", columnDefinition="TEXT")
	private String summery;
	
	@NotEmpty(message = "{NotEmpty.validation}")
	private int year;
	
	@NotEmpty(message = "{NotEmpty.validation}")
	private List<Episode> episodes;
	
	@JsonIgnore
	@Transient
	private MultipartFile poster;
	
	public Season() {}
	
	public Season(int id, String seasonNumber) {
		
		this.id = id;
		this.seasonNumber = seasonNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(String seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}

	public MultipartFile getPoster() {
		return poster;
	}

	public void setPoster(MultipartFile poster) {
		this.poster = poster;
	}

	public String getSummery() {
		return summery;
	}

	public void setSummery(String summery) {
		this.summery = summery;
	}
	
	

}

package edu.mum.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;


import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "tvserie")
public class TVSerie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty(message = "NotEmpty.validation")
	private String title;
	
	@NotEmpty(message = "NotEmpty.validation")
	@Size(min = 50)
	private String description;
	
	@NotEmpty(message = "NotEmpty.validation")
	private String studio;
	
	@NotEmpty(message = "NotEmpty.validation")

    @OneToMany(
            mappedBy = "serie",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
	List<Season> seasons;
	
	@NotEmpty(message = "NotEmpty.validation")
	@OneToMany(
	            mappedBy = "serie",
	            cascade = CascadeType.ALL,
	            fetch = FetchType.EAGER,
	            orphanRemoval = true
	    )
	List<Episode> episodes;
	private Artist artist;
	
	private String genre;
	private Boolean isFeature;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}

	public List<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Boolean getIsFeature() {
		return isFeature;
	}

	public void setIsFeature(Boolean feature) {
		this.isFeature = feature;
	}
	
	
}

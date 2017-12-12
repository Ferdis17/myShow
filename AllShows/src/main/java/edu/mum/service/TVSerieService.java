package edu.mum.service;

import java.util.List;

import edu.mum.domain.TVSerie;

public interface TVSerieService {
	
	void save(TVSerie tvSerie);
	void update(TVSerie tvSerie);
	List<TVSerie> getFeatureTVSeries();
	List<TVSerie> findAll();
	List<TVSerie> findSerieByGenre(String genre);
	List<TVSerie> findByArtist(int artistId);
	List<TVSerie> findByTitle(String title);
	

}

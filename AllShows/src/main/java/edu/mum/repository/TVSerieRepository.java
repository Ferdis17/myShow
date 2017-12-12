package edu.mum.repository;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import edu.mum.domain.TVSerie;

public interface TVSerieRepository extends CrudRepository<TVSerie, Integer>{
	@Query(value = "SELECT * FROM tvserie t WHERE t.isFeature = true", nativeQuery = true)
	List<TVSerie> getFeatureTVSeries();
	
	@Query(value = "SELECT * FROM tvserie t WHERE t.genre = genre", nativeQuery = true)
	List<TVSerie> findSerieByGenre(String genre);
	
	@Query(value = "SELECT * FROM tvserie t WHERE t.artist = artistId", nativeQuery = true)
	List<TVSerie> findByArtist(int artistId);
	
	@Query(value = "SELECT * FROM tvserie t WHERE t.tatle = title", nativeQuery = true)
	List<TVSerie> findByTitle(String title);

}

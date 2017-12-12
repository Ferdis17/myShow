package edu.mum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.domain.TVSerie;
import edu.mum.repository.TVSerieRepository;

@Service
public class TVSerieServiceImpl implements TVSerieService{
	
	@Autowired
	TVSerieRepository tvSerieRepository;
	
	@Autowired
	UserService userSevice;

	@Override
	public void save(TVSerie tvSerie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TVSerie tvSerie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TVSerie> getFeatureTVSeries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TVSerie> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TVSerie> findSerieByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TVSerie> findByArtist(int artistId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TVSerie> findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}

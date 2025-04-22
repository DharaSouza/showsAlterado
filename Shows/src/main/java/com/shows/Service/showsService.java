package com.shows.Service;

import java.util.List;
import java.util.Optional;
import com.shows.Entities.shows;
import com.shows.Repository.showsRepository;

public class showsService {
private final showsRepository showsRepository;
	
	public showsService (showsRepository showsRepository) {
		this.showsRepository = showsRepository;
	}

	public shows salvashows (shows shows) {
		return showsRepository.save(shows);
	}

	public shows getshowsById (Long id) {
		return showsRepository.findById(id).orElse(null);
	}

	public List<shows> getshowsAll() {
		return showsRepository.findAll();
	}

	public shows alterarshows (Long id, shows alterarshows) {
		Optional<shows> existeshows = showsRepository.findById(id);
		if(existeshows.isPresent()) {
			alterarshows.setId(id);
			return showsRepository.save(alterarshows);
		} else {
			return null;
		}
	}

	public boolean deleteshows (Long id) {
		Optional<shows> existeshows = showsRepository.findById(id);
		if (existeshows.isPresent()) {
			showsRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	}

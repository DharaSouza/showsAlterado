package com.shows.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.shows.Entities.shows;
import com.shows.Service.showsService;

public class showsController {
	private final showsService showsService;

	public showsController(showsService showsService) {
		this.showsService = showsService;
	}

	@GetMapping("/")
	public ResponseEntity<List<shows>> getAllshows() {
		List<shows> shows = showsService.getshowsAll();
		return ResponseEntity.ok(shows);
	}

	@GetMapping("/{id}")
	public ResponseEntity<shows> getshowsById(@PathVariable Long id) {
		shows shows = showsService.getshowsById(id);
		if (shows != null) {
			return ResponseEntity.ok(shows);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/")
	public ResponseEntity<shows> criarshows(@RequestBody shows shows) {
		shows = showsService.salvashows(shows);
		return ResponseEntity.status(HttpStatus.CREATED).body(shows);
	}

	@PutMapping("/{id}")
	public ResponseEntity<shows> alterarshows(@PathVariable Long id, @RequestBody shows shows) {
		shows alterarshows = showsService.alterarshows(id, shows);
		if (alterarshows != null) {
			return ResponseEntity.ok(alterarshows);
		} else {
			return ResponseEntity.notFound().build();
		}	
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteShow (@PathVariable Long id){
		boolean deleted = showsService.deleteshows(id);
		if (deleted) {
			return ResponseEntity.ok().body("Show excluído com sucesso!!!");
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}

	

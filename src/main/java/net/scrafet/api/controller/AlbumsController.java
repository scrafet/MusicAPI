package net.scrafet.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.scrafet.api.entity.Album;
import net.scrafet.api.service.IAlbumsService;

@RestController
@RequestMapping("/api")
public class AlbumsController {
	
	@Autowired
	private IAlbumsService serviceAlbum;
	
	@GetMapping("/albums")
	public List<Album> buscarTodos(){
		 return serviceAlbum.buscarTodos();
	}
	
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album) {
		serviceAlbum.guardar(album);
		return album;
		
	}
	
	@PutMapping("/albums")
	public Album modificar(@RequestBody Album album) {
		serviceAlbum.guardar(album);
		return album;
	}

}

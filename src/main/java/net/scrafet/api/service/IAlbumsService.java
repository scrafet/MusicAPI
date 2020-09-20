package net.scrafet.api.service;

import java.util.List;

import net.scrafet.api.entity.Album;

public interface IAlbumsService {

	List<Album> buscarTodos();
	void guardar(Album album);	
}

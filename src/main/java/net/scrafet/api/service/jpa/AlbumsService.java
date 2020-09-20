package net.scrafet.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.scrafet.api.entity.Album;
import net.scrafet.api.repository.AlbumsRepository;
import net.scrafet.api.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {
	
	@Autowired
	private AlbumsRepository repoAlbums;

	@Override
	public List<Album> buscarTodos() {
		
		return repoAlbums.findAll();
	}

}

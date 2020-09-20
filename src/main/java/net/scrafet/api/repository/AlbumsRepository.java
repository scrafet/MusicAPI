package net.scrafet.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.scrafet.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}

package com.teste.primeiro.repository;

import com.teste.primeiro.document.Playlist;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String>{
  
}
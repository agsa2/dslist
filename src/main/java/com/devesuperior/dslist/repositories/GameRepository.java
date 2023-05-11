package com.devesuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

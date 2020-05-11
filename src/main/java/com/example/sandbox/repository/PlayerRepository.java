package com.example.sandbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sandbox.domain.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
package com.example.sandbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sandbox.domain.Server;

@Repository
public interface ServerRepository extends JpaRepository<Server, Long> {

}
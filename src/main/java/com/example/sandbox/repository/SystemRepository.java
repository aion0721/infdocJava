package com.example.sandbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sandbox.domain.System;

@Repository
public interface SystemRepository extends JpaRepository<System, Long> {

}
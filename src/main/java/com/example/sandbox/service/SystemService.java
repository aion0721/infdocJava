package com.example.sandbox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sandbox.domain.System;
import com.example.sandbox.repository.SystemRepository;

@Service
public class SystemService {
    @Autowired
    private SystemRepository systemRepository;

    public List<System> findAll() {
        return systemRepository.findAll();
    }

    public System findOne(Long id) {
        return systemRepository.findById(id).get();
    }

    public System save(System system) {
        return systemRepository.save(system);
    }

    public void delete(Long id) {
        systemRepository.deleteById(id);
    }

}
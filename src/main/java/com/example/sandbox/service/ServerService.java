package com.example.sandbox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sandbox.domain.Server;
import com.example.sandbox.repository.ServerRepository;

@Service
public class ServerService {

    @Autowired
    private ServerRepository serverRepository;

    public List<Server> findAll() {
        return serverRepository.findAll();
    }

    public Server findOne(Long id) {
        return serverRepository.findById(id).get();
    }

    public Server save(Server server) {
        return serverRepository.save(server);
    }

    public void delete(Long id) {
        serverRepository.deleteById(id);
    }

}
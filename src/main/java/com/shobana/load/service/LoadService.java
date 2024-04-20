package com.shobana.load.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shobana.load.repository.LoadRepository;

import com.shobana.load.entity.Loads;
import java.util.List;
import java.util.Optional;

@Service
public class LoadService {

    private final LoadRepository loadRepository;

    @Autowired
    public LoadService(LoadRepository loadRepository) {
        this.loadRepository = loadRepository;
    }
    public Loads createLoad(Loads load) {
        return loadRepository.save(load);
    }
    public List<Loads> getAllLoads() {
        return loadRepository.findAll();
    }
    public Optional<Loads> getLoadById(Long id) {
        return loadRepository.findById(id);
    }
    public void deleteLoad(Long id) {
        loadRepository.deleteById(id);
    }
}

package com.shobana.load.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.shobana.load.service.LoadService;
import com.shobana.load.entity.Loads;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/load")
public class LoadController {

    private final LoadService loadService;

    @Autowired
    public LoadController(LoadService loadService) {
        this.loadService = loadService;
    }

    @PostMapping
    public ResponseEntity<Loads> createLoad(@RequestBody Loads load) {
        Loads createdLoad = loadService.createLoad(load);
        return new ResponseEntity<>(createdLoad, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Loads>> getAllLoads() {
        List<Loads> loads = loadService.getAllLoads();
        return new ResponseEntity<>(loads, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Loads> getLoadById(@PathVariable Long id) {
        Optional<Loads> load = loadService.getLoadById(id);
        return load.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLoad(@PathVariable Long id) {
        loadService.deleteLoad(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

package com.liveasy.controller;

import com.liveasy.model.Load;
import com.liveasy.repository.LoadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/load")
public class LoadsController {

    @Autowired
    private LoadRepo loadRepo;

    @GetMapping
    public List<Load> getAllLoads() {
        return loadRepo.findAll();
    }

//
    @GetMapping("/{loadId}")
    public Optional<Load> getLoadById(@PathVariable Long loadId) {
        return loadRepo.findById(loadId);
    }
    @GetMapping("/load")
    @ResponseBody
    public List<Load> getLoadByShipperId(@RequestParam Long shipperId) {
        return loadRepo.findAll().stream().filter(p -> p.getShipperId().equals(shipperId)).toList();

    }


    @PostMapping()
    public ResponseEntity<String> addLoad(@RequestBody Load load) {
        loadRepo.save(load);
        return ResponseEntity.ok("Load details added successfully");
    }

    @PutMapping("/{id}")
    public Load saveLoad(@PathVariable Long id,@RequestBody Load load) {
        return loadRepo.save(load);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteLoadById(@PathVariable Long id) {
        try{
            Optional<Load> load = loadRepo.findById(id);
            this.loadRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}

package com.example.backorder.controller;


import com.example.backorder.entity.BackorderEntity;
import com.example.backorder.service.BackorderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/backorders")
public class BackorderController {

    private BackorderService backorderService;

    //build create backorder REST API
    @PostMapping
    public ResponseEntity<BackorderEntity> createBackorder(@RequestBody BackorderEntity backorder){
        BackorderEntity savedBackorderEntity=backorderService.createBackorder(backorder);
        return new ResponseEntity<>(savedBackorderEntity, HttpStatus.CREATED);
    }
//build get backorder by id REST API
//http:// localhost :7882/api/backorder
    @GetMapping("{id}")
    public ResponseEntity<BackorderEntity> getBackorderById(@PathVariable("id") Long backorderId){
        BackorderEntity backorder=backorderService.getBackorderById(backorderId);
        return new ResponseEntity<>(backorder, HttpStatus.OK);
    }
//build get all Backorders REST API
    @GetMapping
    public ResponseEntity<List<BackorderEntity>> getAllBackorders(){
        List<BackorderEntity> backorders=backorderService.getAllBackorderEntity();
        return new ResponseEntity<>(backorders, HttpStatus.OK);
    }

//build update backorder REST API
    @PutMapping("{id}")
    public ResponseEntity<BackorderEntity> updateUser(@PathVariable("id") Long userId, @RequestBody BackorderEntity backorder){
        backorder.setId(userId);
        BackorderEntity updatedUser=backorderService.updateBackorder(backorder);
        return new ResponseEntity<>(updatedUser,HttpStatus.OK);
    }

//build delete backorder REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBackorder(@PathVariable("id") Long backorderId){
        backorderService.deleteBackorder(backorderId);
        return new ResponseEntity<>("Backorder Successfully deleted!", HttpStatus.OK);
    }

}

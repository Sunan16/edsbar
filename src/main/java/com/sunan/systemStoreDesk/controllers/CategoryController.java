package com.sunan.systemStoreDesk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunan.systemStoreDesk.data.CategoryVO;
import com.sunan.systemStoreDesk.services.CategoryService;


@RestController
@RequestMapping("/category")
public class CategoryController {
    
    @Autowired
    private CategoryService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CategoryVO> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CategoryVO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CategoryVO create(@RequestBody CategoryVO category) {
        return service.create(category);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CategoryVO update(@RequestBody CategoryVO category) {
        return service.update(category);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build(); // Para voltar o StatusCode 204, que seria o correto (No Content)
    }
    
}

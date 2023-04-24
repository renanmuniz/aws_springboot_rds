package com.renanmuniz.springbootawsrds.controller;

import com.renanmuniz.springbootawsrds.dto.PersonDto;
import com.renanmuniz.springbootawsrds.entity.Person;
import com.renanmuniz.springbootawsrds.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping(value = "/save")
    public ResponseEntity<String> create(@RequestBody PersonDto dto) {
        Person p = new Person();
        p.setName(dto.name);
        p.created_at = LocalDateTime.now();
        try {
            service.createPerson(p);
            return ResponseEntity.created(URI.create("/person/" + dto.id)).build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error creating person.: " + e.getMessage());
        }
    }

}

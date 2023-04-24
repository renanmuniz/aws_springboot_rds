package com.renanmuniz.springbootawsrds.service;

import com.renanmuniz.springbootawsrds.entity.Person;
import com.renanmuniz.springbootawsrds.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public void createPerson(Person p) {
        log.info("Saving: " + p.toString());
        repository.save(p);
    }

}

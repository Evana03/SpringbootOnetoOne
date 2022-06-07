package com.fabrosft.onetoone.controller;


import com.fabrosft.onetoone.model.Passport;
import com.fabrosft.onetoone.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassportController {

    @Autowired
    PassportService passportService;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Passport>> getAllPassport() {
        List<Passport> getAppPassportList = passportService.getPassportDetails();
        return new ResponseEntity<>(getAppPassportList, HttpStatus.OK);
    }

}

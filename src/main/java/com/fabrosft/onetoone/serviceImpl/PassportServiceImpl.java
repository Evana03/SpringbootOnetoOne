package com.fabrosft.onetoone.serviceImpl;

import com.fabrosft.onetoone.model.Passport;
import com.fabrosft.onetoone.repositary.PassportRepositary;
import com.fabrosft.onetoone.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassportServiceImpl implements PassportService {

    @Autowired
    PassportRepositary passportRepositary;

    @Override
    public List<Passport> getPassportDetails() {

        return passportRepositary.findAll();
    }
}

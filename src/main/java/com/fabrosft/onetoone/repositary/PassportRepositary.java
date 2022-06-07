package com.fabrosft.onetoone.repositary;

import com.fabrosft.onetoone.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepositary extends JpaRepository<Passport,Integer> {
}

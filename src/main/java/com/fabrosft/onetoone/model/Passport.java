package com.fabrosft.onetoone.model;


import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "tbl_passport")
public class Passport {

    @Id
    private int passport_id;
    private String number;

    @OneToOne(cascade = CascadeType.ALL)
    private Student student;


}

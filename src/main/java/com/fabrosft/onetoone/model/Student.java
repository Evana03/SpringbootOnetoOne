package com.fabrosft.onetoone.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tbl_student")
public class Student {

    @Id
    private int id;

    private String name;
}

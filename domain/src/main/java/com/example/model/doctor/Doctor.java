package com.example.model.doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class Doctor {
    @Id
    private Integer id;
    private String name;
    private String specialist;

    public Doctor(){}

    public Doctor(Integer id, String name, String specialist) {
        this.id = id;
        this.name = name;
        this.specialist = specialist;
    }
}

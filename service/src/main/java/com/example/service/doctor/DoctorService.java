package com.example.service.doctor;

import com.example.model.doctor.Doctor;
import com.example.repository.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository repository;

    @PostConstruct
    public void initDoctor(){
        repository.saveAll(Stream.of(new Doctor(100, "Arun", "Eye"),
                new Doctor(101, "Vijay", "Ear"),
                        new Doctor(102, "David Malan", "Heart"))
                .collect(Collectors.toSet()));
    }

    public List<Doctor> getDoctors(){
        return repository.findAll();
    }
}

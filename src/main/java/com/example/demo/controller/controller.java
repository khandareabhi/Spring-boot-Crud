package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;
import com.example.demo.repository.StudentRepository;


@RestController
@RequestMapping("/Student")
@CrossOrigin(origins="*")
public class controller {

    @Autowired

    private StudentRepository studentRepository;

    @GetMapping("/all") 
    public List<student> getallstudent(){
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public student getStudent(@PathVariable Long id){
        return studentRepository.findById(id).orElse(null);

    }

    @PostMapping("/add")
    public student addstudnet(@RequestBody student s){
        return studentRepository.save(s);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentRepository.deleteById(id);
        return "Deleted studnet with id " + id;


}
}

package com.cmpt276.studenttracking.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.cmpt276.studenttracking.models.Student;
import com.cmpt276.studenttracking.models.StudentRepository;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class StudentsController {
    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/")
    public String displayAllStudents(Model model){
        System.out.println("Getting all students");
        List<Student> students = studentRepo.findAll();
        model.addAttribute("students", students);
        return "students/allStudents";
    }

    @GetMapping("/add")
    public String showAddForm(){
        return "students/addStudent";
    }

    @PostMapping("/added")
    public RedirectView addStudent(@RequestParam Map<String, String> newStudent, HttpServletResponse response){
        System.out.println(newStudent);
        String studentName = newStudent.get("name");
        double studentWeight = Float.parseFloat(newStudent.get("weight"));
        double studentGPA = Float.parseFloat(newStudent.get("GPA"));
        String studentFavouriteColour = newStudent.get("color");
        String studentHairColour = newStudent.get("hairColour");
        double studentHeight = Float.parseFloat(newStudent.get("height"));
        Student newStudentObject = new Student(studentWeight, studentName, studentHeight, studentHairColour, studentGPA, studentFavouriteColour);
        studentRepo.save(newStudentObject);
        response.setStatus(201);
        return new RedirectView("/");
    }

}

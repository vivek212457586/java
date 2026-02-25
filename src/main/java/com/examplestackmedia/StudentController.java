package com.examplestackmedia;

import com.examplestackmedia.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

//    http://localhost:8080/student

    @GetMapping("student")

    public Student getStudent() {
        Student student;
        student = new Student(
                8,
                "Vivek",
                "Mishra"
        );
        return student;
    }
//    http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getstudents(){
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"Adarsh","Mishra") );
        students.add(new Student(2,"Ram kumar","Mishra") );
        students.add(new Student(3,"Anmol","Mishra") );
        return students;
    }
//    Sring BOOT REST API WITH  Path variable
//{id} --> URI tamplate variable
//   http://localhost:8080/student/1

@GetMapping ("student/{id}")
    public Student studentPathVariable(@PathVariable ("id") int studentid){
       return new Student  (studentid ,"vivek","Mishra");
    }
//    FOR MULTIPLE PATH VARIABLE
//   http://localhost:8080/student/1/firstName/lastName

    @GetMapping ("student/{id}/{first-Name}/{last-Name}")
    public Student studentMultiplePathVariable(@PathVariable ("id") int studentid,
                                               @PathVariable("first-Name") String firstName,
                                               @PathVariable("last-Name") String lastName){
        return new Student (studentid,firstName,lastName);
//        if we want to change the id,firstname or lastname then we direct change from chrome link or from code in new student
//        this is the profit of path variable
//       Path Variable --> When sometimes clint sends a request and url contain a path variable
    }
//    =================================================================================================================
//    SPRING BOOT REST API WITH REQUEST PARAMETER
//      http://localhost:8080/students/query?id=1&firstName=vvk&lastName=mishra
//    id=1-->query parameter
    @GetMapping("students/query")

    public Student studentRequestVariable(@RequestParam  int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName){
        return new Student(id,firstName,lastName);
    }

    }


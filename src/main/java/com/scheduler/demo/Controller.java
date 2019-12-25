package com.scheduler.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;

@RestController
@RequestMapping("/getcourses")
@CrossOrigin
public class Controller {

    @Autowired
    SchedulingLogic sc = new SchedulingLogic();

@GetMapping("/allcourse")
@CrossOrigin
public LinkedList getAllData()
{
    return sc.getUniqueCourseNames();
}

@GetMapping("/teacher")
@CrossOrigin
public LinkedList getTeacherName(@RequestParam String CourseName)
{
return sc.getTeacherName(CourseName);

}
}
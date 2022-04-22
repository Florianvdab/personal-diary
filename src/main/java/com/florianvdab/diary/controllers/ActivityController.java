package com.florianvdab.diary.controllers;

import com.florianvdab.diary.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/activities")
public class ActivityController {

    @Autowired
    ActivityRepository activityRepository;

    @GetMapping("")
    public String displayActivities(Model model) {
        //TODO
        return "projects/new-project";
    }

    @GetMapping("/new")
    public String displayActivityForm(Model model) {
        //TODO
        return "projects/new-project";
    }
}

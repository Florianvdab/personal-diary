package com.florianvdab.diary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/activities")
public class ActivityController {

    @GetMapping("")
    public String displayActivities(Model model) {
        return "projects/new-project";
    }

    @GetMapping("/new")
    public String displayActivityForm(Model model) {
        //TODO
        return "projects/new-project";
    }
}

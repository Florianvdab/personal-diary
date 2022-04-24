package com.florianvdab.diary.controllers;

import com.florianvdab.diary.entities.Activity;
import com.florianvdab.diary.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/activities")
public class ActivityController {

    @Autowired
    ActivityRepository activityRepository;

    @GetMapping("new")
    public String displayActivities(Model model) {
        Activity activity = new Activity();
        model.addAttribute("activity", activity);
        return "activities/new-activity";
    }

    @PostMapping("/save")
    public String saveEmployeeForm(Activity activity, Model model) {
        activityRepository.save(activity);

        return "redirect:/";
    }

    @GetMapping("")
    public String displayActivityForm(Model model) {
        List<Activity> activities = activityRepository.findAll();
        model.addAttribute("activities", activities);
        return "activities/list-activities";
    }
}

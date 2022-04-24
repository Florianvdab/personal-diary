package com.florianvdab.diary.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExerciseType {
    WALK("Walk"),
    HIKE("Hike"),
    WORK_OUT("Work-out"),
    SWIM("Swim"),
    RUN("Run"),
    BIKE("Bike"),
    HOME_TRAINER("Home Trainer");

    private final String displayValue;
}

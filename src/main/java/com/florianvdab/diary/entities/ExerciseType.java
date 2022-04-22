package com.florianvdab.diary.entities;

public enum ExerciseType {
    WALK, HIKE, WORK_OUT, SWIM, RUN, BIKE, HOME_TRAINER;

    public String getText() {
        switch (this) {
            case WALK -> {
                return "Walk";
            }
            case HIKE -> {
                return "Hike";
            }
            case WORK_OUT -> {
                return "Work-out";
            }
            case SWIM -> {
                return "Swim";
            }
            case RUN -> {
                return "Run";
            }
            case BIKE -> {
                return "Bike";
            }
            case HOME_TRAINER -> {
                return "Home Trainer";
            }

        }
        return "";
    }

    @Override
    public String toString() {
        return getText();
    }
}

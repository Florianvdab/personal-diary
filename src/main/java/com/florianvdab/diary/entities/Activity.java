package com.florianvdab.diary.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ACTIVITY")
public class Activity extends EntityBase {
    LocalDateTime localDateTime;
    String title;
    double kcal;
    ExerciseType type;
}

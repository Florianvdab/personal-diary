package com.florianvdab.diary.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ACTIVITY")
public class Activity extends EntityBase {
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    LocalDateTime startDateTime;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    LocalDateTime endDateTime;
    String title;
    double kcal;
    ExerciseType type;
}

package net.bitsrl.progacademiaspringboot.dto;

import net.bitsrl.progacademiaspringboot.model.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class CourseEditionDto {
    private int id;
    private LocalDate start;
    private LocalDate end;
    private BigDecimal cost;
    private Integer courseId;

    public CourseEditionDto(){
    }

    public CourseEditionDto(int id, LocalDate start, LocalDate end, BigDecimal cost, CourseEdition courseEdition) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.cost = cost;
        this.courseId = courseEdition.getId();
    }

    public CourseEditionDto(CourseEdition courseEdition){
        this.id = courseEdition.getId();
        this.start = courseEdition.getStart();
        this.end = courseEdition.getEnd();
        this.cost = courseEdition.getCost();
        this.courseId = courseEdition.getCourse().getId();
    }

    public CourseEdition toCourseEdition(){
        return new CourseEdition(this.getId(), this.getStart(), this.getEnd(), this.getCost(), (byte) 1,
        null, null, null, null, null, null, null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}

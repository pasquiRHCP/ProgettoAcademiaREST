package net.bitsrl.progacademiaspringboot.dto;

import net.bitsrl.progacademiaspringboot.model.Enrollment;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class WipEnrollmentDto {
    private int id;
    private LocalDate enrollmentDate;
    //private boolean withdrawed;
    //private LocalDate withdrawalDate;
    //private boolean passed;
    //private int finalScore;
    //private String assessment;
    private boolean courseFeePaid;
    private int studentId;
    private int courseEditionId;

    public WipEnrollmentDto() {
    }

    public void SubscriptionEnrollmentDto ( int studentId, int courseEditionId, LocalDate enrollmentDate, boolean courseFeePaid) {
        this.id = id;
        this.enrollmentDate = enrollmentDate;
        this.courseFeePaid = courseFeePaid;
        this.studentId = studentId;
        this.courseEditionId = courseEditionId;
    }

    public WipEnrollmentDto(Enrollment e) {
        this.id = e.getId();
        this.studentId = e.getStudent().getId();
        this.courseEditionId = e.getCourseEdition().getId();
        this.courseFeePaid = e.isCourseFeePaid();

    }



}

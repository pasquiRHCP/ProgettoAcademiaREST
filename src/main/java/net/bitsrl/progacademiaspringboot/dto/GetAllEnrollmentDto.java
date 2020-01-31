package net.bitsrl.progacademiaspringboot.dto;

import net.bitsrl.progacademiaspringboot.model.Enrollment;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class GetAllEnrollmentDto {

    private int id;
    private LocalDate enrollmentDate;
    private boolean withdrawed;
    private LocalDate withdrawalDate;
    private boolean passed;
    private int finalScore;
    private String assessment;
    private boolean courseFeePaid;
    private String studentFirstname;
    private String studentLastname;
    //private int courseEditionId;
    private String courseTitle;

    public GetAllEnrollmentDto() {
    }

//    public EnrollmentDto ( int studentId, int courseEditionId, LocalDate enrollmentDate, boolean courseFeePaid) {
//        this.id = id;
//        this.enrollmentDate = enrollmentDate;
//        this.courseFeePaid = courseFeePaid;
//        this.studentId = studentId;
//        this.courseEditionId = courseEditionId;
//    }

    public GetAllEnrollmentDto(Enrollment e) {
        this.id = e.getId();
        this.enrollmentDate = e.getEnrollmentDate();
        this.withdrawed = e.isWithdrawed();
        this.withdrawalDate = e.getWithdrawalDate();
        this.passed = e.isPassed();
        this.finalScore = e.getFinalScore();
        this.assessment = e.getAssessment();
        this.studentLastname = e.getStudent().getLastname();
        this.studentFirstname = e.getStudent().getFirstname();
        this.courseTitle = e.getCourseEdition().getCourse().getTitle();
        this.courseFeePaid = e.isCourseFeePaid();

    }
}

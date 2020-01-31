package net.bitsrl.progacademiaspringboot.dto;

import net.bitsrl.progacademiaspringboot.model.CourseEdition;
import net.bitsrl.progacademiaspringboot.model.Enrollment;
import net.bitsrl.progacademiaspringboot.model.Student;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;


@Component
public class EnrollmentDto {
    private int id;
    private LocalDate enrollmentDate;
    private boolean withdrawed;
    private LocalDate withdrawalDate;
    private boolean passed;
    private int finalScore;
    private String assessment;
    private boolean courseFeePaid;
    private int studentId;
    private int courseEditionId;
    private String firstnameStud;
    private String lastnameStud;
    private BigDecimal costCourseEdition;
    private String titleCourse;


    public EnrollmentDto(){
    }

//    public EnrollmentDto(int id, Integer studentId, Integer courseEditionId, boolean courseFeePaid, LocalDate enrollmentDate,
//                         boolean withdrawed, LocalDate withdrawalDate, boolean passed, String assessment, int finalScore) {
//        this.id = id;
//        this.studentId = studentId;
//        this.courseEditionId = courseEditionId;
//        this.courseFeePaid = courseFeePaid;
//        this.enrollmentDate = enrollmentDate;
//        this.withdrawed = withdrawed;
//        this.passed = passed;
//        this.assessment = assessment;
//        this.finalScore = finalScore;
//        this.withdrawalDate = withdrawalDate;
//    }

    public EnrollmentDto(Enrollment e){

        this.id = e.getId();
        this.studentId = e.getStudent().getId();
        this.lastnameStud = e.getStudent().getLastname();
        this.firstnameStud = e.getStudent().getFirstname();
        this.courseEditionId = e.getCourseEdition().getId();
        this.courseFeePaid = e.isCourseFeePaid();
        this.costCourseEdition = e.getCourseEdition().getCost();
        this.titleCourse = e.getCourseEdition().getCourse().getTitle();
        this.enrollmentDate = e.getEnrollmentDate();

        if (e.isWithdrawed()) {
            this.withdrawed = e.isWithdrawed();
            this.withdrawalDate = e.getWithdrawalDate();
        }
        if (e.isPassed()) {
            this.passed = e.isPassed();
            this.finalScore = e.getFinalScore();
            this.assessment = e.getAssessment();
        }
    }

   public Enrollment toEnrollment() {
       Student student = null;
        if (this.studentId != 0) {
            student.setId(this.studentId);
        }
       CourseEdition courseEdition = null;
        if (this.courseEditionId != 0) {
            courseEdition.setId(this.courseEditionId);
        }

         return new Enrollment(this.getId(), this.enrollmentDate, false, null,
       false, 0, null, this.isCourseFeePaid(), student, courseEdition);
   }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCourseFeePaid() {
        return courseFeePaid;
    }

    public void setCourseFeePaid(boolean courseFeePaid) {
        this.courseFeePaid = courseFeePaid;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseEditionId() {
        return courseEditionId;
    }

    public void setCourseEditionId(Integer courseEditionId) {
        this.courseEditionId = courseEditionId;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public boolean isWithdrawed() {
        return withdrawed;
    }

    public void setWithdrawed(boolean withdrawed) {
        this.withdrawed = withdrawed;
    }

    public LocalDate getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(LocalDate withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setCourseEditionId(int courseEditionId) {
        this.courseEditionId = courseEditionId;
    }

    public String getFirstnameStud() {
        return firstnameStud;
    }

    public void setFirstnameStud(String firstnameStud) {
        this.firstnameStud = firstnameStud;
    }

    public String getLastnameStud() {
        return lastnameStud;
    }

    public void setLastnameStud(String lastnameStud) {
        this.lastnameStud = lastnameStud;
    }

    public BigDecimal getCostCourseEdition() {
        return costCourseEdition;
    }

    public void setCostCourseEdition(BigDecimal costCourseEdition) {
        this.costCourseEdition = costCourseEdition;
    }

    public String getTitleCourse() {
        return titleCourse;
    }

    public void setTitleCourse(String titleCourse) {
        this.titleCourse = titleCourse;
    }
}

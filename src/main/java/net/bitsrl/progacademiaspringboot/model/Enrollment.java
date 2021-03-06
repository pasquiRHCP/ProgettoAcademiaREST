package net.bitsrl.progacademiaspringboot.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Enrollment {
    private int id;
    private LocalDate enrollmentDate;
    private boolean withdrawed;
    private LocalDate withdrawalDate;
    private boolean passed;
    private int finalScore;
    private String assessment;
    private boolean courseFeePaid;
    private Student student;
    private CourseEdition courseEdition;

    public Enrollment() {
    }

    public Enrollment(int id, LocalDate enrollmentDate, boolean withdrawed, LocalDate withdrawalDate,
                      boolean passed, int finalScore, String assessment, boolean courseFeePaid, Student student,
                      CourseEdition courseEdition) {
        this.id = id;
        this.enrollmentDate = enrollmentDate;
        this.withdrawed = withdrawed;
        this.withdrawalDate = withdrawalDate;
        this.passed = passed;
        this.finalScore = finalScore;
        this.assessment = assessment;
        this.courseFeePaid = courseFeePaid;
        this.student = student;
        this.courseEdition = courseEdition;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "enrollment_date", nullable = false)
    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Basic
    @Column(name = "withdrawed", nullable = false)
    public boolean isWithdrawed() {
        return withdrawed;
    }

    public void setWithdrawed(boolean withdrawed) {
        this.withdrawed = withdrawed;
    }

    @Basic
    @Column(name = "withdrawal_date", nullable = true)
    public LocalDate getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(LocalDate withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }

    @Basic
    @Column(name = "passed", nullable = true)
    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    @Basic
    @Column(name = "final_score", nullable = true)
    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    @Basic
    @Column(name = "assessment", nullable = true, length = 45)
    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    @Basic
    @Column(name = "course_fee_paid", nullable = true)
    public boolean isCourseFeePaid() {
        return courseFeePaid;
    }

    public void setCourseFeePaid(boolean courseFeePaid) {
        this.courseFeePaid = courseFeePaid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enrollment that = (Enrollment) o;
        return id == that.id &&
                withdrawed == that.withdrawed &&
                passed == that.passed &&
                finalScore == that.finalScore &&
                courseFeePaid == that.courseFeePaid &&
                Objects.equals(enrollmentDate, that.enrollmentDate) &&
                Objects.equals(withdrawalDate, that.withdrawalDate) &&
                Objects.equals(assessment, that.assessment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, enrollmentDate, withdrawed, withdrawalDate, passed, finalScore, assessment, courseFeePaid);
    }

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false)
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    @JoinColumn(name = "course_edition_id", referencedColumnName = "id", nullable = false)
    public CourseEdition getCourseEdition() {
        return courseEdition;
    }

    public void setCourseEdition(CourseEdition courseEdition) {
        this.courseEdition = courseEdition;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "id=" + id +
                ", enrollmentDate=" + enrollmentDate +
                ", withdrawed=" + withdrawed +
                ", withdrawalDate=" + withdrawalDate +
                ", passed=" + passed +
                ", finalScore=" + finalScore +
                ", assessment='" + assessment + '\'' +
                ", courseFeePaid=" + courseFeePaid +
                ", student=" + student +
                ", courseEdition=" + courseEdition +
                '}';
    }
}

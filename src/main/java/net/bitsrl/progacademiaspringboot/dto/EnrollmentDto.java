package net.bitsrl.progacademiaspringboot.dto;

import net.bitsrl.progacademiaspringboot.model.Enrollment;
import net.bitsrl.progacademiaspringboot.model.Student;
import org.springframework.stereotype.Component;


@Component
public class EnrollmentDto {
    private int id;
    private boolean courseFeePaid;
    private Integer studentId;
    private Integer courseEditionId;

    public EnrollmentDto(){
    }

    public EnrollmentDto(int id, boolean courseFeePaid, Student student, Integer studentId, Integer courseEditionId) {
        this.id = id;
        this.courseFeePaid = courseFeePaid;
        this.studentId = studentId;
        this.courseEditionId = courseEditionId;
    }

    public EnrollmentDto(Enrollment enrollment){
        this.id = enrollment.getId();
        this.courseFeePaid = enrollment.isCourseFeePaid();
        this.studentId = enrollment.getStudent().getId();
        this.courseEditionId = enrollment.getCourseEdition().getId();
    }

   public Enrollment toEnrollment(){
        return new Enrollment(this.getId(), null, false, null,
       false, 0, null, this.isCourseFeePaid(), null,
                null);
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
}

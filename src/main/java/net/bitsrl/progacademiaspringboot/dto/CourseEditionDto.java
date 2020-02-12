package net.bitsrl.progacademiaspringboot.dto;

import net.bitsrl.progacademiaspringboot.model.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collection;

@Component
public class CourseEditionDto {
    private int id;
    private LocalDate start;
    private LocalDate end;
    private BigDecimal cost;
    private boolean isExternal;
    private String address;
    private String city;
    private String zip;
    private String leadTeacherName;
    private String managerName;
    private String courseTitle;
    private int leadTeacherId;
    private int managerId;
    private int courseId;
    private int mainClassroomId;

    public CourseEditionDto(){
    }

    public CourseEditionDto(int id, LocalDate start, LocalDate end, BigDecimal cost, boolean isExternal,
                            String address, String city, String zip, String leadTeacherName, String managerName,
                            String courseTitle, int leadTeacherId, int managerId, int courseId, int mainClassroomId) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.cost = cost;
        this.isExternal = isExternal;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.leadTeacherName = leadTeacherName;
        this.managerName = managerName;
        this.courseTitle = courseTitle;
        this.leadTeacherId = leadTeacherId;
        this.managerId = managerId;
        this.courseId = courseId;
        this.mainClassroomId = mainClassroomId;
    }

    public CourseEditionDto(CourseEdition courseEdition){
        this.id = courseEdition.getId();
        this.start = courseEdition.getStart();
        this.end = courseEdition.getEnd();
        this.cost = courseEdition.getCost();
        this.isExternal = courseEdition.getIsExternal();
        this.address = courseEdition.getAddress();
        this.city = courseEdition.getCity();
        this.zip = courseEdition.getZip();
        this.leadTeacherName = courseEdition.getLeadTeacher() == null ? null : courseEdition.getLeadTeacher().getFirstname() + courseEdition.getLeadTeacher().getLastname();
        this.managerName = courseEdition.getManager() == null ? null : courseEdition.getManager().getFirstname() + courseEdition.getManager().getLastname();
        this.courseTitle = courseEdition.getCourse() == null ? null : courseEdition.getCourse().getTitle();
        this.leadTeacherId = courseEdition.getLeadTeacher() == null ? 0 : courseEdition.getLeadTeacher().getId();
        this.managerId = courseEdition.getManager() == null ? 0 : courseEdition.getManager().getId();
        this.courseId = courseEdition.getCourse() == null ? 0 : courseEdition.getCourse().getId();
    }

    public CourseEdition toCourseEdition(){
        Agent leadTeacher = null;
        Agent manager = null;
        Classroom mainClassroom = null;
        Course course = null;

        if(this.leadTeacherId != 0) {
            leadTeacher = new Agent();
            leadTeacher.setId(this.getLeadTeacherId());
            leadTeacher.setFirstname(this.getLeadTeacherName());
        }
        if(this.managerId != 0) {
            manager = new Agent();
            manager.setId(this.getManagerId());
            manager.setFirstname(this.getManagerName());
        }
        if(this.mainClassroomId != 0) {
            mainClassroom = new Classroom();
            mainClassroom.setId(this.getMainClassroomId());
        }
        if(this.courseId != 0) {
            course = new Course();
            course.setId(this.getCourseId());
            course.setTitle(this.getCourseTitle());
        }

        return new CourseEdition( this.getId(), this.getStart(), this.getEnd(), this.getCost(), this.isExternal(),
                this.getAddress(), this.getCity(), this.getZip(), leadTeacher, manager, mainClassroom, course);
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

    public boolean isExternal() {
        return isExternal;
    }

    public void setExternal(boolean external) {
        isExternal = external;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLeadTeacherName() {
        return leadTeacherName;
    }

    public void setLeadTeacherName(String leadTeacherName) {
        this.leadTeacherName = leadTeacherName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getLeadTeacherId() {
        return leadTeacherId;
    }

    public void setLeadTeacherId(int leadTeacherId) {
        this.leadTeacherId = leadTeacherId;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getMainClassroomId() {
        return mainClassroomId;
    }

    public void setMainClassroomId(int mainClassroomId) {
        this.mainClassroomId = mainClassroomId;
    }


}

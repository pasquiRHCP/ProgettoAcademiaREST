package net.bitsrl.progacademiaspringboot.dto;

import net.bitsrl.progacademiaspringboot.model.Area;
import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.model.Level;
import net.bitsrl.progacademiaspringboot.model.Project;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CourseDto {

    private int id;
    private String title;
    private String description;
    private String syllabus;
    private int numHours;
    private Level level;
    private BigDecimal cost;
    private Integer areaId;
    private Integer projectId;
    private String areaName;
    private String projectName;


    public CourseDto() {
    }

    public CourseDto(int id, String title, String description,
                     String syllabus, int numHours, Level level,
                     BigDecimal cost, int areaId, int projectId, String areaName, String projectName) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.syllabus = syllabus;
        this.numHours = numHours;
        this.level = level;
        this.cost = cost;
        this.areaId = areaId;
        this.projectId = projectId;
        this.areaName = areaName;
        this.projectName = projectName;
    }

    public CourseDto(Course course) {
        this.id = course.getId();
        this.title = course.getTitle();
        this.description = course.getDescription();
        this.syllabus = course.getSyllabus();
        this.numHours = course.getNumHours();
        this.level = course.getLevel();
        this.cost = course.getCost();
        this.areaId = course.getArea() == null ? 0 : course.getArea().getId();
        this.projectId = course.getProject() == null ? 0 : course.getProject().getId();
        this.areaName = course.getArea() == null ? null : course.getArea().getName();
        this.projectName = course.getProject() == null ? null : course.getProject().getName();
    }

    public Course toCourse(){
        Area area = null;
        Project project = null;
        if(this.areaId != 0) {
            area = new Area();
            area.setId(this.getAreaId());
            area.setName(this.getAreaName());
        }
//        area.setId(1);
//        area.setName("Informatica");
        if(this.projectId != 0) {
            project = new Project();
            project.setId(this.getProjectId());
            project.setName(this.getProjectName());
        }
            return new Course(this.getId(), this.getTitle(), this.getDescription(), this.getSyllabus(),
                                this.getNumHours(), this.getLevel(), this.getCost(), area, project );
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public int getNumHours() {
        return numHours;
    }

    public void setNumHours(int numHours) {
        this.numHours = numHours;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


}

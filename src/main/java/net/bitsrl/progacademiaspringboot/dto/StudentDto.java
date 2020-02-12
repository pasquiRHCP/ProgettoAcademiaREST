package net.bitsrl.progacademiaspringboot.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import net.bitsrl.progacademiaspringboot.model.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class StudentDto {
    private int id;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String sex;
    private DegreeType degreeType;
    private String degreeTitle;
    private boolean isPrivate;
    private String email;
    private String phone;
    private int clientId;
    private String clientName;

    public StudentDto(){
    }

    public StudentDto(int id, String firstname, String lastname, LocalDate dateOfBirth,
                      String sex, DegreeType degreeType, String degreeTitle, boolean isPrivate,
                      String email, String phone, int clientId, String clientName) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.degreeType = degreeType;
        this.degreeTitle = degreeTitle;
        this.isPrivate = isPrivate;
        this.email = email;
        this.phone = phone;
        this.clientId = clientId;
        this.clientName = clientName;
    }

    public StudentDto(Student student){
        this.id = student.getId();
        this.firstname = student.getFirstname();
        this.lastname = student.getLastname();
        this.dateOfBirth = student.getDateOfBirth();
        this.sex = student.getSex();
        this.degreeType = student.getDegreeType();
        this.degreeTitle = student.getDegreeTitle();
        this.isPrivate = student.isPrivate();
        this.email = student.getEmail();
        this.phone = student.getPhone();
        this.clientId = student.getClient() == null ? 0 : student.getClient().getId();
        this.clientName = student.getClient() == null ? null : student.getClient().getName();
    }

    public Student toStudent(){
        Client client = null;
        if(this.clientId != 0){
            client = new Client();
            client.setId(this.getClientId());
            client.setName(this.getClientName());
        }
        return new Student(this.getId(), this.getFirstname(), this.getLastname(), this.getDateOfBirth(), this.getSex(),
                this.getDegreeType(), this.getDegreeTitle(), this.isPrivate(), this.getEmail(), this.getPhone(), client);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public DegreeType getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(DegreeType degreeType) {
        this.degreeType = degreeType;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    @JsonProperty(value="isPrivate")
    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}

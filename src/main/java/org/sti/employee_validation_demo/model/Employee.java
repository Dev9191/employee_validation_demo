package org.sti.employee_validation_demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMP_ID")
    private     int id;

    @Column(name = "FIRST_NAME")
    @NotNull(message = "First Name can't be empty")
    @Size(min = 2, max = 60)
    private     String firstName;

    @Column(name = "LAST_NAME")
    @NotNull(message = "Last Name cannot be empty")
    @Size(min = 2, max = 60)
    private     String lastName;

    @Column(name = "EMAIL")
    @NotNull(message = "Please Provide a valid email address")
    @Size(min = 6, max = 60)
    private     String email;

    @Column(name = "ADDRESS")
    @NotNull(message = "Address field cannot be empty")
    @Size(min = 12, max = 60)
    private     String address;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

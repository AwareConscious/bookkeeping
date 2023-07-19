package org.bookkeeping;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    private Integer id;
    private String firstName;
    private String secondName;
    private String lastName;

    private boolean residentOfKazakhstan;

    private BigDecimal salary;
    private BigDecimal permanentPremium;
    private Date employmentDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isResidentOfKazakhstan() {
        return residentOfKazakhstan;
    }

    public void setResidentOfKazakhstan(boolean residentOfKazakhstan) {
        this.residentOfKazakhstan = residentOfKazakhstan;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getPermanentPremium() {
        return permanentPremium;
    }

    public void setPermanentPremium(BigDecimal permanentPremium) {
        this.permanentPremium = permanentPremium;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }
}

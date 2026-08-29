package com.example.shareholder_management.shareholder;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ShareholderDTO {

    @NotBlank(message = "Folio/BO number is required")
    @Size(max = 16, message = "Folio/BO number cannot exceed 16 characters")
    private String folioBo;

    @NotNull(message = "Customer type is required")
    private Integer customerType;

    @NotBlank(message = "Shareholder name is required")
    @Size(max = 100, message = "Shareholder name cannot exceed 100 characters")
    private String shareholderName;

    @Size(max = 80, message = "Representative cannot exceed 80 characters")
    private String representative;

    private Integer citizenType;

    @NotBlank(message = "Residence type is required")
    @Size(max = 15, message = "Residence type cannot exceed 15 characters")
    private String residenceType;

    @Size(max = 11, message = "Phone number cannot exceed 11 characters")
    private String phone;

    @Email(message = "Please enter a valid email address")
    @Size(max = 60, message = "Email cannot exceed 60 characters")
    private String email;

    @NotNull(message = "Registration date is required")
    private String registrationDate;

    @NotNull(message = "Please select whether the shareholder is an employee")
    private Integer isEmployee;

    @Size(max = 17, message = "NID cannot exceed 17 characters")
    private String nid;

    @Size(max = 12, message = "TIN cannot exceed 12 characters")
    private String tin;

    private Integer icbCode;


    // Getters and Setters

    public String getFolioBo() {
        return folioBo;
    }

    public void setFolioBo(String folioBo) {
        this.folioBo = folioBo;
    }

    public Integer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public String getShareholderName() {
        return shareholderName;
    }

    public void setShareholderName(String shareholderName) {
        this.shareholderName = shareholderName;
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public Integer getCitizenType() {
        return citizenType;
    }

    public void setCitizenType(Integer citizenType) {
        this.citizenType = citizenType;
    }

    public String getResidenceType() {
        return residenceType;
    }

    public void setResidenceType(String residenceType) {
        this.residenceType = residenceType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getIsEmployee() {
        return isEmployee;
    }

    public void setIsEmployee(Integer isEmployee) {
        this.isEmployee = isEmployee;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public Integer getIcbCode() {
        return icbCode;
    }

    public void setIcbCode(Integer icbCode) {
        this.icbCode = icbCode;
    }
}
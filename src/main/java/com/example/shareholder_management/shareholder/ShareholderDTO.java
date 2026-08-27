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

    @NotNull(message = "Please select whether the shareholder is an employee")
    private Integer isEmployee;

    @NotBlank(message = "Residence type is required")
    @Size(max = 15, message = "Residence type cannot exceed 15 characters")
    private String residenceType;

    @Size(max = 17, message = "NID cannot exceed 17 characters")
    private String nid;

    @Size(max = 11, message = "Phone number cannot exceed 11 characters")
    private String phone;

    @Size(max = 12, message = "TIN cannot exceed 12 characters")
    private String tin;

    @Email(message = "Please enter a valid email address")
    @Size(max = 60, message = "Email cannot exceed 60 characters")
    private String email;

    @NotBlank(message = "Registration date is required")
    private String registrationDate;

    private Integer icbCode;

    @NotBlank(message = "Address is required")
    @Size(max = 80, message = "Address cannot exceed 80 characters")
    private String add1;

    @Size(max = 80, message = "Address cannot exceed 80 characters")
    private String add2;

    @Size(max = 80, message = "Address cannot exceed 80 characters")
    private String add3;

    @Size(max = 80, message = "Address cannot exceed 80 characters")
    private String add4;

    @NotBlank(message = "Country name is required")
    @Size(max = 60, message = "Country name cannot exceed 60 characters")
    private String countryName;

    private String bankName;
    private String branchName;
    private String accountNumber;
    private String routingNumber;


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

    public Integer getIsEmployee() {
        return isEmployee;
    }

    public void setIsEmployee(Integer isEmployee) {
        this.isEmployee = isEmployee;
    }

    public String getResidenceType() {
        return residenceType;
    }

    public void setResidenceType(String residenceType) {
        this.residenceType = residenceType;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
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

    public Integer getIcbCode() {
        return icbCode;
    }

    public void setIcbCode(Integer icbCode) {
        this.icbCode = icbCode;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public String getAdd3() {
        return add3;
    }

    public void setAdd3(String add3) {
        this.add3 = add3;
    }

    public String getAdd4() {
        return add4;
    }

    public void setAdd4(String add4) {
        this.add4 = add4;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }
}
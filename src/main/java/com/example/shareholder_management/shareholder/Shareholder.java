package com.example.shareholder_management.shareholder;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "T_ACCOUNT_SHARE")
@Getter
@Setter
public class Shareholder {

    @Id
    @Column(name = "OID")
    private String oid;

    @Column(name = "FOLIO_BO", nullable = false, unique = true)
    private String folioBo;

    @Column(name = "CUST_NAME", nullable = false)
    private String custName;

    @Column(name = "REPRESENTATIVE")
    private String representative;

    @Column(name = "CUST_TYPE")
    private Integer custType;

    @Column(name = "CITIZEN_TYPE")
    private Integer citizenType;

    @Column(name = "RESIDENT_TYPE", nullable = false)
    private String residentType;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "REGISTRATION_DATE")
    private java.time.LocalDate registrationDate;

    @Column(name = "IS_EMPLOYEE")
    private Integer isEmployee;

    @Column(name = "NID_NO")
    private String nidNo;

    @Column(name = "TIN_NO")
    private String tinNo;

    @Column(name = "ICB_CODE")
    private Integer icbCode;


}
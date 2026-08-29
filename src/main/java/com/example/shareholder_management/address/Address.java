package com.example.shareholder_management.address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T_ADDRESS_SHARE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @Column(name = "OID", length = 20, nullable = false)
    private String oid;

    @Column(name = "FOLIO_BO", length = 16, nullable = false)
    private String folioBo;

    @Column(name = "ADD1", length = 80, nullable = false)
    private String add1;

    @Column(name = "ADD2", length = 80)
    private String add2;

    @Column(name = "ADD3", length = 80)
    private String add3;

    @Column(name = "ADD4", length = 80)
    private String add4;

    @Column(name = "COUNTRY_NAME", length = 60, nullable = false)
    private String countryName;
}
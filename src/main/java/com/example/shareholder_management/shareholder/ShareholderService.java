package com.example.shareholder_management.shareholder;

import com.example.shareholder_management.address.Address;
import com.example.shareholder_management.address.AddressRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Service
public class ShareholderService {

    private final ShareholderRepository shareholderRepository;
    private final AddressRepository addressRepository;

    public ShareholderService(
            ShareholderRepository shareholderRepository,
            AddressRepository addressRepository) {

        this.shareholderRepository = shareholderRepository;
        this.addressRepository = addressRepository;
    }

    @Transactional
    public void registerShareholder(ShareholderFormDTO form) {

        ShareholderDTO shareholderDTO = form.getShareholder();
        AddressDTO addressDTO = form.getAddress();

        // =========================
        // CHECK DUPLICATE FOLIO/BO
        // =========================

        if (shareholderRepository.existsByFolioBo(shareholderDTO.getFolioBo())) {
            throw new IllegalArgumentException(
                    "FOLIO/BO number already exists."
            );
        }


        // =========================
        // SHAREHOLDER
        // =========================

        Shareholder shareholder = new Shareholder();

        shareholder.setOid(UUID.randomUUID().toString());

        shareholder.setFolioBo(
                shareholderDTO.getFolioBo()
        );

        shareholder.setCustName(
                shareholderDTO.getShareholderName()
        );

        shareholder.setRepresentative(
                shareholderDTO.getRepresentative()
        );

        shareholder.setCustType(
                shareholderDTO.getCustomerType()
        );

        shareholder.setCitizenType(
                shareholderDTO.getCitizenType()
        );

        shareholder.setResidentType(
                shareholderDTO.getResidenceType()
        );

        shareholder.setPhone(
                shareholderDTO.getPhone()
        );

        shareholder.setEmail(
                shareholderDTO.getEmail()
        );

        shareholder.setRegistrationDate(
                LocalDate.parse(
                        shareholderDTO.getRegistrationDate(),
                        DateTimeFormatter.ofPattern("MM/dd/yyyy")
                )
        );

        shareholder.setIsEmployee(
                shareholderDTO.getIsEmployee()
        );

        shareholder.setNidNo(
                shareholderDTO.getNid()
        );

        shareholder.setTinNo(
                shareholderDTO.getTin()
        );

        shareholder.setIcbCode(
                shareholderDTO.getIcbCode()
        );

        shareholderRepository.save(shareholder);


        // =========================
        // ADDRESS
        // =========================

        Address address = new Address();

        address.setOid(
                UUID.randomUUID().toString()
        );

        address.setFolioBo(
                shareholderDTO.getFolioBo()
        );

        address.setAdd1(
                addressDTO.getAdd1()
        );

        address.setAdd2(
                addressDTO.getAdd2()
        );

        address.setAdd3(
                addressDTO.getAdd3()
        );

        address.setAdd4(
                addressDTO.getAdd4()
        );

        address.setCountryName(
                addressDTO.getCountryName()
        );

        addressRepository.save(address);
    }
}
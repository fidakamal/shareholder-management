package com.example.shareholder_management.shareholder;

import org.springframework.stereotype.Service;

@Service
public class ShareholderService {

    public void registerShareholder(ShareholderFormDTO form) {

        ShareholderDTO shareholder = form.getShareholder();
        AddressDTO address = form.getAddress();

        System.out.println("=== SHAREHOLDER SERVICE ===");

        System.out.println("Folio/BO: " + shareholder.getFolioBo());
        System.out.println("Name: " + shareholder.getShareholderName());
        System.out.println("Phone: " + shareholder.getPhone());
        System.out.println("Email: " + shareholder.getEmail());

        System.out.println("=== ADDRESS ===");

        System.out.println("Address 1: " + address.getAdd1());
        System.out.println("Address 2: " + address.getAdd2());
        System.out.println("Address 3: " + address.getAdd3());
        System.out.println("Address 4: " + address.getAdd4());
        System.out.println("Country: " + address.getCountryName());
    }
}

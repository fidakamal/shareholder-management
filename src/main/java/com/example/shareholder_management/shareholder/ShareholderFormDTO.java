package com.example.shareholder_management.shareholder;

import jakarta.validation.Valid;

public class ShareholderFormDTO {

    @Valid
    private ShareholderDTO shareholder;

    @Valid
    private AddressDTO address;


    public ShareholderDTO getShareholder() {
        return shareholder;
    }

    public void setShareholder(ShareholderDTO shareholder) {
        this.shareholder = shareholder;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }
}
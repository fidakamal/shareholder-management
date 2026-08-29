package com.example.shareholder_management.shareholder;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShareholderController {

    @GetMapping("/shareholders/new")
    public String showShareholderForm(Model model) {

        ShareholderFormDTO form = new ShareholderFormDTO();

        form.setShareholder(new ShareholderDTO());
        form.setAddress(new AddressDTO());

        model.addAttribute("shareholderForm", form);

        return "shareholder/form";
    }

    @PostMapping("/shareholders")
    public String submitShareholder(
            @Valid @ModelAttribute("shareholderForm") ShareholderFormDTO form,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "shareholder/form";
        }

        // Temporary console output
        System.out.println("Folio/BO: "
                + form.getShareholder().getFolioBo());

        System.out.println("Name: "
                + form.getShareholder().getShareholderName());

        System.out.println("Phone: "
                + form.getShareholder().getPhone());

        System.out.println("Email: "
                + form.getShareholder().getEmail());

        System.out.println("Address 1: "
                + form.getAddress().getAdd1());

        System.out.println("Country: "
                + form.getAddress().getCountryName());

        return "shareholder/form";
    }
}
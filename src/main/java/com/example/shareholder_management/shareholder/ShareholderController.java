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

        model.addAttribute("shareholder", new ShareholderDTO());

        return "shareholder/form";
    }

    @PostMapping("/shareholders")
    public String submitShareholder(
            @Valid @ModelAttribute("shareholder") ShareholderDTO shareholder,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "shareholder/form";
        }

        System.out.println("Folio/BO: " + shareholder.getFolioBo());
        System.out.println("Name: " + shareholder.getShareholderName());
        System.out.println("Phone: " + shareholder.getPhone());
        System.out.println("Email: " + shareholder.getEmail());

        return "shareholder/form";
    }
}
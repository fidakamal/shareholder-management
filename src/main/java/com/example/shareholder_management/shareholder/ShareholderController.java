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

    private final ShareholderService shareholderService;

    public ShareholderController(ShareholderService shareholderService) {
        this.shareholderService = shareholderService;
    }

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
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            return "shareholder/form";
        }

        try {

            shareholderService.registerShareholder(form);

            model.addAttribute(
                    "successMessage",
                    "Shareholder registered successfully!"
            );

            return "shareholder/form";

        } catch (IllegalArgumentException e) {

            model.addAttribute(
                    "errorMessage",
                    e.getMessage()
            );

            return "shareholder/form";
        }
    }
}